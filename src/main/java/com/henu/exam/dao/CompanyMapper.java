package com.henu.exam.dao;

import com.henu.exam.bean.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(String comid);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String comid);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}