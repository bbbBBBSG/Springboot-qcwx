package com.dahai.controller;

import com.dahai.bean.BaseResponse;
import com.dahai.dao.model.User;
import com.dahai.service.UserService;
import com.dahai.utils.AccountValidatorUtil;
import com.dahai.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public BaseResponse getHomeBanners(@RequestBody User user) {
        BaseResponse response = new BaseResponse();
        System.out.println(user.toString());
        if ((StringUtils.checkStrNull(user.getUsername()) && StringUtils.checkStrNull(user.getEmail())) || StringUtils.checkStrNull(user.getPassword())) {
            response.error_code = "1001";
            response.reason = "用户名或密码为空";
            return response;
        }

        User login = userService.login(user.getUsername(),user.getEmail(), user.getPassword());
        response.result = login;
        if (login==null) {
            response.error_code = "1000";
            response.reason = "用户名或密码错误";
        }
        return response;
    }

    @GetMapping("/sendEmailCode")
    public BaseResponse sendEmailCode(String email) {
        BaseResponse response = new BaseResponse();
        if (AccountValidatorUtil.isEmail(email)) {
            String send = userService.send(email);
            if (StringUtils.checkStrNull(send)) {
                response.reason = "发送失败";
                response.error_code = "1002";
                return response;
            }
            response.result = send;
        } else {
            response.reason = "邮箱不匹配";
            response.error_code = "1003";
        }
        return response;
    }

    @GetMapping("/register")
    public BaseResponse register(String email,String password,String code){
        BaseResponse response = new BaseResponse();
        if (StringUtils.checkStrNull(email)) {
            response.error_code = "1004";
            response.reason = "邮箱不能为空";
            return response;
        }
        if (StringUtils.checkStrNull(password)) {
            response.error_code = "1004";
            response.reason = "密码不能为空";
            return response;
        }
        if (StringUtils.checkStrNull(code)) {
            response.error_code = "1004";
            response.reason = "验证码不能为空";
            return response;
        }

        // 校验code
        boolean emailCode = userService.isAvailable(email, code);
        if (!emailCode) {
            response.error_code = "1004";
            response.reason = "验证码已失效";
            return response;
        }

        // 判断邮箱是否存在
        List<User> userByEmail = userService.findUserByEmail(email);
        if (userByEmail!=null && userByEmail.size()>0) {
            response.error_code = "1005";
            response.reason = "该邮箱已注册";
            return response;
        }
        userService.register(email, password, code);
        return response;
    }
}
