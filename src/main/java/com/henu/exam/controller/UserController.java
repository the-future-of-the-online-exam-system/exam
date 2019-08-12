package com.henu.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(){

        return "user/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){

        return "welcome";
    }

    @RequestMapping("/examList")
    public String examList(){

        return "depart_admin/examList";
    }

    @RequestMapping("/examInfo")
    public String examInfo(){

        return "user/examInfo";
    }
    @RequestMapping("/queryScore")
    public String queryScore(){

        return "user/queryScore";
    }

    @RequestMapping("/user_setting")
    public String user_setting(){

        return "user/manageSelfInfo";
    }

    @RequestMapping("/examCertificate")
    public String examCertificate(){

        return "user/examCertificate";
    }

    @RequestMapping("/aboutSystem")
    public String aboutSystem(){

        return "aboutSystem";
    }

}
