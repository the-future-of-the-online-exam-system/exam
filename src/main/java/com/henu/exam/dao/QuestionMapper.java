package com.henu.exam.dao;

import com.henu.exam.bean.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(String questionsdbid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(String questionsdbid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}