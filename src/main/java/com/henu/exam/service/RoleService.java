package com.henu.exam.service;

import com.henu.exam.bean.Role;

public interface RoleService {

    int deleteByPrimaryKey(String id);

    int insert(Role role);

    int insertSelective(Role role);

    Role selectByPrimaryKey(String role);

    int updateByPrimaryKeySelective(Role role);

    int updateByPrimaryKey(Role role);
}
