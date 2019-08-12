package com.henu.exam.service.impl;

import com.henu.exam.bean.User;
import com.henu.exam.dao.UserMapper;
import com.henu.exam.service.UserService;
import com.henu.exam.util.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public int deleteByUserId(String id) {
        return 0;
    }

    @Override
    public int register(User user) {

        return userMapper.register(user);
    }

    @Override
    public int login(HttpServletRequest request) {


        String userType = request.getParameter("userType");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        password = MD5Util.encode(password);
        User user = userMapper.login(username, userType);

        if(user==null){

            log.info("用户名不存在");
            return -1;
        } else {

            log.info("用户名存在");
            log.info(userType+" "+username+"登录成功");
            if(user.getPassword().equals(password)) {

                log.info("登陆成功");
                HttpSession session = request.getSession();
                session.setAttribute("loginName", user.getUsername());
                if("ROLE_USER".equals(userType)){
                    return 3;
                } else if("ROLE_DEPARTADMIN".equals(userType)){
                    return 2;
                } else if("ROLE_SUPERADMIN".equals(userType)){
                    return 1;
                } else {
                    return 0;
                }

            } else {

                log.info("密码错误");
                return 0;
            }

        }
    }

    @Override
    public int updateUser(User user) {

        return userMapper.updateUser(user);
    }
}
