package com.henu.exam.dao;

import com.henu.exam.bean.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role role);

    int insertSelective(Role role);

    Role selectByPrimaryKey(String role);

    int updateByPrimaryKeySelective(Role role);

    int updateByPrimaryKey(Role role);
}