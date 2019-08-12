package com.henu.exam.controller;

import com.henu.exam.bean.Company;
import com.henu.exam.bean.User;
import com.henu.exam.bean.UserRole;

import com.henu.exam.service.CompanyService;
import com.henu.exam.service.RoleUserService;
import com.henu.exam.service.UserService;

import com.henu.exam.util.BaseUtil;

import com.henu.exam.util.MD5Util;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private UserService userServiceImpl;
    @Autowired
    private RoleUserService roleUserServiceImpl;
    @Autowired(required = false)
    private CompanyService companyServiceImpl;

    @RequestMapping("/login.do")
    @ResponseBody
    public int doLogin(HttpServletRequest request){

        return userServiceImpl.login(request);
    }


    @RequestMapping("/register.do")
    @ResponseBody
    public int doRegister(User user) {
        log.info(user.toString());
        user.setPassword(MD5Util.encode(user.getPassword()));
        String userId = BaseUtil.getUid().replace("-", "");
        user.setId(userId);
        user.setNote("无");
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            user.setCreateDate(sdf.parse(sdf.format(date)));
        } catch (ParseException e) {

            log.error("日期转换失败");
        }
        user.setStatus(1);
        UserRole roleUser = new UserRole();
        roleUser.setUserId(userId);

        int result = userServiceImpl.register(user)+roleUserServiceImpl.insert(roleUser);

        log.info("注册结果"+result);

        return result;
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
