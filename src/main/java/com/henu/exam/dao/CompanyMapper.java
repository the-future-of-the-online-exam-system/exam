package com.henu.exam.dao;

import com.henu.exam.bean.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    int deleteById(String id);

    int insert(Company company);

    int insertSelective(Company company);

    Company selectById(String id);

    List<Company> selectAll();

    int updateByIdSelective(Company company);

    int updateById(Company company);
}