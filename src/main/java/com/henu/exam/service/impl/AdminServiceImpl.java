package com.henu.exam.service.impl;

import com.henu.exam.bean.PaperInfo;
import com.henu.exam.dao.PaperInfoMapper;
import com.henu.exam.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private PaperInfoMapper paperInfoMapper;

    @Override
    public int insert(PaperInfo paperInfo) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        return paperInfoMapper.insert(paperInfo);
    }
}
