package com.henu.exam.service.impl;

import com.henu.exam.bean.Admin;
import com.henu.exam.dao.AdminMapper;
import com.henu.exam.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int deleteByUsername(String username) {

        return 0;
    }

    @Override
    public int insert(Admin admin) {

        return 0;
    }

    @Override
    public int login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Admin admin = adminMapper.getUserByUserName(username);

        if(admin==null){

            return -1;
        } else {

            log.info("用户名存在");
            if(admin.getPassword().equals(password)) {

                log.info("登陆成功");
                return 3;
            } else {

                log.error("密码错误");
                return 0;
            }

        }

    }

    @Override
    public int updateUser(Admin admin) {

        return 0;
    }
}
