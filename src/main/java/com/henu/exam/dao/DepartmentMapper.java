package com.henu.exam.dao;

import com.henu.exam.bean.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    int deleteById(String id);

    int insert(Department department);

    int insertSelective(Department department);

    Department selectById(String id);

    int updateByIdSelective(Department department);

    int updateById(Department department);

    List<Department> selectByComName(String comName);
}