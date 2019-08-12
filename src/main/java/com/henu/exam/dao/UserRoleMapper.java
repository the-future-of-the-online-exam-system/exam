package com.henu.exam.dao;

import com.henu.exam.bean.UserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper {

    int deleteById(String id);

    int insert(UserRole userRole);

    int insertSelective(UserRole userRole);

    UserRole selectById(String id);

    int updateByIdSelective(UserRole userRole);

    int updateById(UserRole userRole);
}