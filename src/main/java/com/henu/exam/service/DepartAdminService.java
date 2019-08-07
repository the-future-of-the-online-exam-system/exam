package com.henu.exam.service;

import com.henu.exam.bean.DepartAdmin;

import javax.servlet.http.HttpServletRequest;

public interface DepartAdminService {

    int deleteByUsername(String username);

    int insert(DepartAdmin departAdmin);

    int login(HttpServletRequest request);

    int updateUser(DepartAdmin departAdmin);
}
