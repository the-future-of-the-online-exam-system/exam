package com.henu.exam.controller;

import com.henu.exam.bean.Department;
import com.henu.exam.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentServiceImpl;

    @RequestMapping("/common/getDepartment.do")
    @ResponseBody
    public List<Department> getDepartment(String comName){

        log.info("获取"+comName+"所属部门列表");

        List<Department> departments = departmentServiceImpl.selectByComName(comName);

        return departments;
    }

}
