package com.henu.exam.bean;

import java.io.Serializable;

public class ExamInfoWithBLOBs extends ExamInfo implements Serializable {
    private String examdata;

    private String examcheck;

    private static final long serialVersionUID = 1L;

    public String getExamdata() {
        return examdata;
    }

    public void setExamdata(String examdata) {
        this.examdata = examdata == null ? null : examdata.trim();
    }

    public String getExamcheck() {
        return examcheck;
    }

    public void setExamcheck(String examcheck) {
        this.examcheck = examcheck == null ? null : examcheck.trim();
    }
}