package com.henu.exam.dao;

import com.henu.exam.bean.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    /**
     * 删除账户
     * @param username
     * @return
     */
    public Admin deleteByUsername(String username);

    /**
     * 添加账户
     * @param admin
     * @return
     */
    int insert(Admin admin);

    /**
     * 根据用户名查找账户
     * @param username
     * @return
     */
    Admin getUserByUserName(String username);

    /**
     * 更新账户
     * @param admin
     * @return
     */
    int updateUser(Admin admin);

}