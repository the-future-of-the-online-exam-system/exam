package com.henu.exam.dao;

import com.henu.exam.bean.PaperInfo;

public interface PaperInfoMapper {
    int deleteByPrimaryKey(String paperid);

    int insert(PaperInfo record);

    int insertSelective(PaperInfo record);

    PaperInfo selectByPrimaryKey(String paperid);

    int updateByPrimaryKeySelective(PaperInfo record);

    int updateByPrimaryKey(PaperInfo record);
}