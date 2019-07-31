package com.henu.exam.dao;

import com.henu.exam.bean.AdminRole;

public interface AdminRoleMapper {
    int deleteByPrimaryKey(String adminroleid);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    AdminRole selectByPrimaryKey(String adminroleid);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}