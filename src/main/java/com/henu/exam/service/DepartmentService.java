package com.henu.exam.service;

import com.henu.exam.bean.Department;

import java.util.List;


public interface DepartmentService {

    public List<Department> selectByComName(String comName);
}
