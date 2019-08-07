package com.henu.exam.dao;

import com.henu.exam.bean.Trainee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TraineeMapper {

    /**
     * 删除账户
     * @param username
     * @return
     */
    Trainee deleteByUsername(String username);

    /**
     * 添加账户
     * @param trainee
     * @return
     */
    int insert(Trainee trainee);

    /**
     * 根据用户名查找账户
     * @param username
     * @return
     */
    Trainee getUserByUserName(String username);

    /**
     * 更新账户
     * @param trainee
     * @return
     */
    int updateUser(Trainee trainee);
}