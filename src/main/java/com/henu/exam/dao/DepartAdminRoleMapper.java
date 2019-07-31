package com.henu.exam.dao;

import com.henu.exam.bean.DepartAdminRole;

public interface DepartAdminRoleMapper {
    int deleteByPrimaryKey(String departadminrole);

    int insert(DepartAdminRole record);

    int insertSelective(DepartAdminRole record);

    DepartAdminRole selectByPrimaryKey(String departadminrole);

    int updateByPrimaryKeySelective(DepartAdminRole record);

    int updateByPrimaryKey(DepartAdminRole record);
}