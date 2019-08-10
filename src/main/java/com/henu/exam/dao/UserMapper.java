package com.henu.exam.dao;

import com.henu.exam.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 删除账户
     * @param username
     * @return
     */
    public User deleteByUsername(String username);

    public User selectByUserName(String username);

    /**
     * 添加账户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 根据用户名查找账户
     * @param username
     * @return
     */
    User login(String username, String userType);

    /**
     * 更新账户
     * @param user
     * @return
     */
    int updateUser(User user);

    int updateByPrimaryKey(User record);
}