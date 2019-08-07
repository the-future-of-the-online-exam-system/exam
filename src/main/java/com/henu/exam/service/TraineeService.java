package com.henu.exam.service;

import com.henu.exam.bean.Trainee;

import javax.servlet.http.HttpServletRequest;

public interface TraineeService {

    int deleteByUsername(String username);

    int insert(Trainee trainee);

    int login(HttpServletRequest request);

    int updateUser(Trainee trainee);
}
