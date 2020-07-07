package com.dahai.service;

import com.dahai.dao.model.EmailCode;
import com.dahai.dao.model.EmailCodeExample;
import com.dahai.dao.model.User;
import com.dahai.dao.model.UserExample;
import com.dahai.dao.EmailCodeMapper;
import com.dahai.dao.UserMapper;
import com.dahai.utils.DateUtils;
import com.dahai.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EmailCodeMapper emailCodeMapper;
    @Autowired
    private JavaMailSender jms;

    /**
     * 登录
     * @param username 用户名
     * @param email 邮箱
     * @param password 密码
     */
    public User login(String username,String email, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.checkStrNull(email)) {
            criteria.andEmailEqualTo(email);
        }
        if (!StringUtils.checkStrNull(password)) {
            criteria.andPasswordEqualTo(password);
        }
        if (!StringUtils.checkStrNull(username)) {
            criteria.andUsernameEqualTo(username);
        }
        List<User> users = userMapper.selectByExample(example);
        if (users.size()==1) {
            return users.get(0);
        }
        return null;
    }

    /**
     * 发送验证码
     * @param email 邮箱
     * @return 返回1发送成功
     */
    public String send(String email){
        String fourCode = StringUtils.getFourCode();
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            //谁发的
            mailMessage.setFrom("17620037710@163.com");
            //发给谁
            mailMessage.setTo(email);
            //标题
            mailMessage.setSubject("oho邮箱验证码");
            //内容
            mailMessage.setText("欢迎使用oho，验证码"+ fourCode +"。5分钟内有效，如非本人操作，请检查账号安全 \n请勿泄漏验证码");
            jms.send(mailMessage);

            // 删除之前的验证码
            EmailCodeExample example = new EmailCodeExample();
            EmailCodeExample.Criteria criteria = example.createCriteria();
            criteria.andEmailEqualTo(email);
            emailCodeMapper.deleteByExample(example);
            // 存储验证码
            EmailCode emailCode = new EmailCode();
            emailCode.setCode(fourCode);
            emailCode.setEmail(email);
            emailCode.setTime(DateUtils.getLocalDate());
            emailCodeMapper.insert(emailCode);
        } catch (Exception e) {
            e.printStackTrace();
            fourCode = null;
        }
        return fourCode;
    }

    /**
     * 查找用户
     * @param email 邮箱
     */
    public List<User> findUserByEmail(String email) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        return userMapper.selectByExample(example);
    }

    /**
     * 查找用户
     * @param username 昵称
     */
    public List<User> findUserByUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(example);
    }

    /**
     * 查找用户
     * @param userId id
     */
    public List<User> findUserByUserId(String userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        return userMapper.selectByExample(example);
    }

    /**
     * 注册
     * @param email 邮箱
     * @param password 密码
     * @param code 验证码
     */
    public void register(String email, String password, String code) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setCreatedtime(DateUtils.getLocalDate());
        user.setUserid(UUID.randomUUID().toString());
        user.setUsername(email.split("@")[0]);
        user.setStatus("1");
        user.setSex("1");
        user.setIsemailcheck("1");
        userMapper.insert(user);
    }

    /**
     * 验证邮箱验证码是否有效
     * @param email 邮箱
     * @param code 验证码
     */
    public boolean isAvailable(String email,String code) {
        EmailCodeExample example = new EmailCodeExample();
        EmailCodeExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        List<EmailCode> emailCodes = emailCodeMapper.selectByExample(example);
        if (emailCodes.size()>0) {
            for (EmailCode emailCode : emailCodes) {
                if (emailCode.getCode().equals(code)) {
                    String localDate = DateUtils.getLocalDate();
                    String time = emailCode.getTime();
                    long diff = DateUtils.secBetween(localDate, time);
                    if (diff<5*60*1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
