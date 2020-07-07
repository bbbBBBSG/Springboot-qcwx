package com.dahai.controller;

import com.dahai.bean.BaseResponse;
import com.dahai.dao.BannerMapper;
import com.dahai.dao.model.BannerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class BannerController {

    @Autowired
    private BannerMapper bannerMapper;

    @GetMapping("/banner/getHomeBanner")
    public BaseResponse getHomeBanner() {
        BaseResponse response = new BaseResponse();
        response.result = bannerMapper.selectByExample(new BannerExample());
        return response;
    }
}
