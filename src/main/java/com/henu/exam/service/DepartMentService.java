package com.henu.exam.service;

import com.henu.exam.bean.Department;

import java.util.List;


public interface DepartMentService {

    public List<Department> selectByComName(String comName);
}
