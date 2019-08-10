package com.henu.exam.controller;


import com.henu.exam.bean.Company;
import com.henu.exam.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/common")
public class CompanyController {

    @Autowired
    private CompanyService companyServiceImpl;

    @RequestMapping("/getCompany.do")
    @ResponseBody
    public List<Company> getCompany(Model model){

        return companyServiceImpl.selectAll();

    }

}
