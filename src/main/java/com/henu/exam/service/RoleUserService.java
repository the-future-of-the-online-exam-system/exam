package com.henu.exam.service;

import com.henu.exam.bean.UserRole;

public interface RoleUserService {

    int deleteById(String id);

    int insert(UserRole roleUser);

    int insertSelective(UserRole roleUser);

    UserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRole roleUser);

    int updateByPrimaryKey(UserRole roleUser);
}
