package com.henu.exam.dao;

import com.henu.exam.bean.QuestionInfo;
import com.henu.exam.bean.QuestionInfoWithBLOBs;

public interface QuestionInfoMapper {
    int deleteByPrimaryKey(String questionid);

    int insert(QuestionInfoWithBLOBs record);

    int insertSelective(QuestionInfoWithBLOBs record);

    QuestionInfoWithBLOBs selectByPrimaryKey(String questionid);

    int updateByPrimaryKeySelective(QuestionInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionInfoWithBLOBs record);

    int updateByPrimaryKey(QuestionInfo record);
}