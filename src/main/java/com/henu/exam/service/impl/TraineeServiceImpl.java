package com.henu.exam.service.impl;

import com.henu.exam.bean.Trainee;
import com.henu.exam.service.TraineeService;
import com.henu.exam.util.BaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TraineeServiceImpl implements TraineeService {

//    @Autowired(required = false)
//    private TraineeMapper traineeMapper;

    @Override
    public int deleteByUsername(String username) {
        return 0;
    }

    @Override
    public int insert(Trainee trainee) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        trainee.setId(BaseUtil.getUid());
        trainee.setStatus(1);
        trainee.setRole(0);
        trainee.setDate(new Date());

        return 0;
    }

    @Override
    public int login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


//        Trainee trainee = traineeMapper.getUserByUserName(username);
        Trainee trainee = null;

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
