package com.henu.exam.dao;

import com.henu.exam.bean.Trainee;

public interface TraineeMapper {
    int deleteByPrimaryKey(String traineeid);

    int insert(Trainee record);

    int insertSelective(Trainee record);

    Trainee selectByPrimaryKey(String traineeid);

    int updateByPrimaryKeySelective(Trainee record);

    int updateByPrimaryKey(Trainee record);
}