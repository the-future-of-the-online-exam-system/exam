package com.henu.exam.controller;

import com.henu.exam.service.AdminService;
import com.henu.exam.service.DepartAdminService;
import com.henu.exam.service.TraineeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private AdminService adminServiceImpl;

    @Autowired
    private TraineeService traineeServiceImpl;

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
            adminServiceImpl.login(request);
        }

        return 0;
    }

}
