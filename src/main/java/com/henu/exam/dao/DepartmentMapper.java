package com.henu.exam.dao;

import com.henu.exam.bean.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    int deleteByPrimaryKey(String id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByComName(String comName);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}