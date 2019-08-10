package com.henu.exam.controller;

import com.henu.exam.bean.PaperInfo;
import com.henu.exam.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
@Slf4j
@Secured({"SPUERADMIN"})
public class AdminController {

    @Autowired
    private AdminService adminServiceImpl;

    @RequestMapping("/createPaper.do")
    @ResponseBody()
    public int doCreatePaper(PaperInfo paperInfo){

        int result = adminServiceImpl.insert(paperInfo);

        log.info(result+"");

        return result;
    }
}
