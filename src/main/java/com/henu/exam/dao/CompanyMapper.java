package com.henu.exam.dao;

import com.henu.exam.bean.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectAll();

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}