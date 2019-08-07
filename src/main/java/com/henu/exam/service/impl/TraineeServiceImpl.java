package com.henu.exam.service.impl;

import com.henu.exam.bean.Trainee;
import com.henu.exam.dao.TraineeMapper;
import com.henu.exam.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeMapper traineeMapper;

    @Override
    public int deleteByUsername(String username) {
        return 0;
    }

    @Override
    public int insert(Trainee trainee) {
        return 0;
    }

    @Override
    public int login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Trainee trainee = traineeMapper.getUserByUserName(username);

        if(trainee==null){

            return -1;
        } else {

            if(trainee.getPassword().equals(password)) {

                return 1;
            } else {

                return 0;
            }

        }
    }

    @Override
    public int updateUser(Trainee trainee) {
        return 0;
    }
}
