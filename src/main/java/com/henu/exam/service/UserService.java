package com.henu.exam.service;

import com.henu.exam.bean.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    int deleteByUsername(String username);

    int insert(User user);

    int login(HttpServletRequest request);

    int updateUser(User user);
}
