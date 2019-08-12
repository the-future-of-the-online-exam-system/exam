package com.henu.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/depart")
public class DepartAdminController {

    @RequestMapping("/index")
    public String depart_admin(){

        return "depart_admin/index";
    }

    @RequestMapping("/examInfo")
    public String exam_paper(){

        return "depart_admin/examInfo";
    }
    @RequestMapping("/examList")
    public String examList(){

        return "depart_admin/examList";
    }

    @RequestMapping("/user_setting")
    public String user_setting(){

        return "depart_admin/manageSelfInfo";
    }

    @RequestMapping("/examCertificate")
    public String examCertificate(){

        return "depart_admin/examCertificate";
    }

    @RequestMapping("/manageUser")
    public String manageUser(){

        return "depart_admin/manageUser";
    }

    @RequestMapping("/welcome")
    public String welcome(){

        return "welcome";
    }

    @RequestMapping("/aboutSystem")
    public String aboutSystem(){

        return "aboutSystem";
    }

    @RequestMapping("/queryScore")
    public String queryScore(){

        return "user/queryScore";
    }
}
