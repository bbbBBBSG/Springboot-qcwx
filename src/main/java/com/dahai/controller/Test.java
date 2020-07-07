package com.dahai.controller;

import com.dahai.dao.TestDAO;
import com.dahai.service.JsoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController()
public class Test {

    @Autowired
    private TestDAO service;
    @Autowired
    private JsoupService jsoupService;

    @GetMapping("/hello")
    public Map<String,Object> hello() throws Exception {

        return null;
    }

}
