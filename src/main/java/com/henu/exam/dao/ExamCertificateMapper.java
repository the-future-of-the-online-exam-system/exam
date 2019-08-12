package com.henu.exam.dao;

import com.henu.exam.bean.ExamCertificate;

public interface ExamCertificateMapper {
    int deleteByPrimaryKey(String id);

    int insert(ExamCertificate record);

    int insertSelective(ExamCertificate record);

    ExamCertificate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ExamCertificate record);

    int updateByPrimaryKey(ExamCertificate record);
}