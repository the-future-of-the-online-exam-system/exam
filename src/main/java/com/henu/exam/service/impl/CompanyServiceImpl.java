package com.henu.exam.service.impl;

import com.alibaba.druid.filter.AutoLoad;
import com.henu.exam.bean.Company;
import com.henu.exam.dao.CompanyMapper;
import com.henu.exam.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired(required = false)
    private CompanyMapper companyMapper;

    @Override
    public List<Company> selectAll() {

        return companyMapper.selectAll();
    }
}
