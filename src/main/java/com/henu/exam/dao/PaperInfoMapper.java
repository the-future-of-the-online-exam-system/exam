package com.henu.exam.dao;

import com.henu.exam.bean.PaperInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaperInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(PaperInfo paperInfo);

    int insertSelective(PaperInfo record);

    PaperInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PaperInfo record);

    int updateByPrimaryKey(PaperInfo record);
}