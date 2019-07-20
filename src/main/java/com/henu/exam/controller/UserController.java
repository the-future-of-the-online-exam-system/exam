package com.henu.exam.controller;

import com.henu.exam.util.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/test")
    public String test(){

        logger.info("测试");
        System.out.println(MD5Util.getMD5Code("admin"));
        return "test";
    }

}
