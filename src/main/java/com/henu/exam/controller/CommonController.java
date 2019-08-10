package com.henu.exam.controller;

import com.henu.exam.bean.Company;
import com.henu.exam.bean.Trainee;
import com.henu.exam.service.CompanyService;
import com.henu.exam.service.TraineeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CompanyService companyServiceImpl;

/**
    @Autowired
    private AdminService adminServiceImpl;



    @Autowired
    private DepartAdminService departAdminServiceImpl;

    @RequestMapping("/login.do")
    @ResponseBody
    public int doLogin(HttpServletRequest request){

        String userType = request.getParameter("userType");

        if("学员".equals(userType)){

            log.info("学员登录");
            return traineeServiceImpl.login(request);
        } else if("部门管理员".equals(userType)){

            log.info("部门管理员登录");
            return departAdminServiceImpl.login(request);
        } else if("超级管理员".equals(userType)){

            log.info("超级管理员登录");
            return adminServiceImpl.login(request);
        }

        return 0;
    }


    */

    @RequestMapping("/register.do")
    @ResponseBody
    public int doRegister(@RequestBody Trainee trainee){

        return 0;
    }

    @RequestMapping("/register")
    public ModelAndView register(){

        ModelAndView modelAndView = new ModelAndView();
        List<Company> companies = companyServiceImpl.selectAll();

        log.info("获取单位列表");

        modelAndView.addObject("companyList", companies);

        modelAndView.setViewName("register");

        return modelAndView;
    }
}
