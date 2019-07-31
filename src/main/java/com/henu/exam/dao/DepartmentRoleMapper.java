package com.henu.exam.dao;

import com.henu.exam.bean.DepartmentRole;

public interface DepartmentRoleMapper {
    int deleteByPrimaryKey(String departid);

    int insert(DepartmentRole record);

    int insertSelective(DepartmentRole record);

    DepartmentRole selectByPrimaryKey(String departid);

    int updateByPrimaryKeySelective(DepartmentRole record);

    int updateByPrimaryKey(DepartmentRole record);
}