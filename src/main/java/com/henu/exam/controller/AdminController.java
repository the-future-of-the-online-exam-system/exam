package com.henu.exam.controller;

import com.henu.exam.bean.ExamInfo;
import com.henu.exam.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Autowired(required = false)
    private AdminService adminServiceImpl;

    @RequestMapping("/createPaper.do")
    @ResponseBody()
    public int doCreatePaper(ExamInfo examInfo){

        int result = adminServiceImpl.insert(examInfo);

        log.info(result+"");

        return result;
    }














    @RequestMapping("/index")
    public String index_admin(){

        return "admin/index";
    }

    @RequestMapping("/createPaper")
    public String createPaper(HttpServletResponse response){

        return "admin/createPaper";
    }

    @GetMapping("/managePaper")
    public String managePaper(){

        return "admin/managePaper";
    }

    @RequestMapping("/addQuestion")
    public String addQuestion(){

        return "admin/addQuestion";
    }

    @RequestMapping("/welcome")
    public String welcome(){

        return "welcome";
    }

    @RequestMapping("/manageDepartAdmin")
    public String table_Trainee_Admin(){

        return "admin/manageDepartAdmin";
    }

    @RequestMapping("/manageNews")
    public String table_News(){

        return "admin/manageNews";
    }

    @RequestMapping("/user_setting")
    public String user_setting_admin(){

        return "admin/manageSelfInfo";
    }

    @RequestMapping("/manageUser")
    public String table_Trainee(){

        return "admin/manageUser";
    }

    @RequestMapping("/aboutSystem")
    public String aboutSystem(){

        return "aboutSystem";
    }

}
