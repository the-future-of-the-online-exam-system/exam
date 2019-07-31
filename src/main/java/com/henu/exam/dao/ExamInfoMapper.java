package com.henu.exam.dao;

import com.henu.exam.bean.ExamInfo;
import com.henu.exam.bean.ExamInfoKey;
import com.henu.exam.bean.ExamInfoWithBLOBs;

public interface ExamInfoMapper {
    int deleteByPrimaryKey(ExamInfoKey key);

    int insert(ExamInfoWithBLOBs record);

    int insertSelective(ExamInfoWithBLOBs record);

    ExamInfoWithBLOBs selectByPrimaryKey(ExamInfoKey key);

    int updateByPrimaryKeySelective(ExamInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamInfoWithBLOBs record);

    int updateByPrimaryKey(ExamInfo record);
}