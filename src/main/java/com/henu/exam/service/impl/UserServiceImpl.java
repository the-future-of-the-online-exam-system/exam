package com.henu.exam.service.impl;

import com.henu.exam.bean.User;
import com.henu.exam.dao.UserMapper;
import com.henu.exam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public int deleteByUsername(String username) {
        return 0;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userType = request.getParameter("userType");

        HttpSession session = request.getSession();

        User user = userMapper.getUserByUserName(username, userType);

        if(user==null){

            log.info("用户名不存在");
            return -1;
        } else {

            log.info("用户名存在");
            if(user.getPassword().equals(password)) {

                log.info("登陆成功");
                return 3;
            } else {

                log.info("密码错误");
                return 0;
            }

        }
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
