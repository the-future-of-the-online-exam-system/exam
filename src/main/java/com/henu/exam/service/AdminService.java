package com.henu.exam.service;

import com.henu.exam.bean.Admin;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {

    int deleteByUsername(String username);

    int insert(Admin admin);

    int login(HttpServletRequest request);

    int updateUser(Admin admin);
}
