package com.henu.exam.service.impl;

import com.henu.exam.bean.User;
import com.henu.exam.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPermission implements UserDetailsService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.selectByUserName(username);
        if (user != null) {
            return user;
        } else {
            throw new UsernameNotFoundException(username + " do not exist!");
        }
    }
}
