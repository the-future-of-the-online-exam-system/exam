package com.henu.exam.dao;

import com.henu.exam.bean.RoleUser;

public interface RoleUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}