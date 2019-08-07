package com.henu.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @GetMapping(value = "/")
    public String defaultPath() {

        return "forward:login";
    }
    @RequestMapping("/login")
    public String login() {

        return "login";
    }
}
