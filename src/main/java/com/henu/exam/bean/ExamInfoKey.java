package com.henu.exam.bean;

import java.io.Serializable;

public class ExamInfoKey implements Serializable {
    private String examid;

    private String paperid;

    private String traineeid;

    private static final long serialVersionUID = 1L;

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid == null ? null : examid.trim();
    }

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid = paperid == null ? null : paperid.trim();
    }

    public String getTraineeid() {
        return traineeid;
    }

    public void setTraineeid(String traineeid) {
        this.traineeid = traineeid == null ? null : traineeid.trim();
    }
}