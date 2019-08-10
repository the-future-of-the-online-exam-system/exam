package com.henu.exam.controller;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("/admin/index")
    public String index_admin(){

        return "index-admin";
    }

    @RequestMapping("/depart/index")
    public String depart_index(){

        return "depart-admin";
    }

    @RequestMapping("trainee/index")
    public String index(){

        return "index";
    }

    @GetMapping("/admin/createPaper")
    public String createPaper(){

        return "page/createPaper";
    }

    @GetMapping("/admin/managePaper")
    public String managePaper(){

        return "page/managePaper";
    }

    @RequestMapping("/admin/addQuestion")

    public String addQuestion(){

        return "page/generate-test-paper";
    }

    @RequestMapping("/errorPage")
    public String errorPage(){

        return "error/error";
    }



}
