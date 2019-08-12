package com.henu.exam.dao;

import com.henu.exam.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    /**
     * 删除账户
     * @param username
     * @return
     */
    public User deleteByUserId(String username);


    /**
     * 权限认证
     * 暂时
     * @param username
     * @return
     */
    public User selectByUserName(String username);

    /**
     * 添加账户
     * @param user
     * @return
     */
    int register(User user);

    /**
     * 根据用户名查找账户
     * @param username
     * @return
     */
    User login(@Param("username") String username, @Param("userType") String userType);

    /**
     * 更新账户
     * @param user
     * @return
     */
    int updateUser(User user);

}