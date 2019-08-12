package com.henu.exam.dao;

import com.henu.exam.bean.ExamInfo;

public interface ExamInfoMapper {

    int deleteById(String id);

    int insert(ExamInfo record);

    int insertSelective(ExamInfo record);

    ExamInfo selectById(String id);

    int updateByIdSelective(ExamInfo record);

    int updateById(ExamInfo record);
}