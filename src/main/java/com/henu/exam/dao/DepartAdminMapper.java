package com.henu.exam.dao;

import com.henu.exam.bean.DepartAdmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartAdminMapper {

    /**
     * 删除账户
     * @param username
     * @return
     */
    public DepartAdmin deleteByUsername(String username);

    /**
     * 添加账户
     * @param departAdmin
     * @return
     */
    int insert(DepartAdmin departAdmin);

    /**
     * 根据用户名查找账户
     * @param username
     * @return
     */
    DepartAdmin getUserByUserName(String username);

    /**
     * 更新账户
     * @param departAdmin
     * @return
     */
    int updateUser(DepartAdmin departAdmin);
}