package com.henu.exam.service.impl;

import com.henu.exam.bean.ExamInfo;
import com.henu.exam.dao.ExamInfoMapper;
import com.henu.exam.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private ExamInfoMapper examInfoMapper;

    @Override
    public int insert(ExamInfo examInfo) {

        return examInfoMapper.insert(examInfo);
    }
}
