package com.henu.exam.service.impl;

import com.henu.exam.bean.Department;
import com.henu.exam.dao.DepartmentMapper;
import com.henu.exam.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired(required = false)
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectByComName(String comName) {

        return departmentMapper.selectByComName(comName);
    }
}
