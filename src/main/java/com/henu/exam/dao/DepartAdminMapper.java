package com.henu.exam.dao;

import com.henu.exam.bean.DepartAdmin;

public interface DepartAdminMapper {
    int deleteByPrimaryKey(String departadminid);

    int insert(DepartAdmin record);

    int insertSelective(DepartAdmin record);

    DepartAdmin selectByPrimaryKey(String departadminid);

    int updateByPrimaryKeySelective(DepartAdmin record);

    int updateByPrimaryKey(DepartAdmin record);
}