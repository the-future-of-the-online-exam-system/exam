package com.henu.exam.service.impl;

import com.henu.exam.bean.DepartAdmin;
import com.henu.exam.dao.DepartAdminMapper;
import com.henu.exam.service.DepartAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class DepartAdminServiceImpl implements DepartAdminService {

    @Autowired
    private DepartAdminMapper departAdminMapper;

    @Override
    public int deleteByUsername(String username) {
        return 0;
    }

    @Override
    public int insert(DepartAdmin departAdmin) {
        return 0;
    }

    @Override
    public int login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        DepartAdmin departAdmin = departAdminMapper.getUserByUserName(username);

        if(departAdmin==null){

            return -1;
        } else {

            if(departAdmin.getPassword().equals(password)) {

                return 3;
            } else {

                return 0;
            }

        }
    }

    @Override
    public int updateUser(DepartAdmin departAdmin) {
        return 0;
    }
}
