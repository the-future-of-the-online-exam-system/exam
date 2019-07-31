package com.henu.exam.bean;

import java.io.Serializable;

public class ExamCertificate implements Serializable {
    private String traineeid;

    private String comid;

    private String paperid;

    private String departadmin;

    private Short classhour;

    private Short ifpass;

    private static final long serialVersionUID = 1L;

    public String getTraineeid() {
        return traineeid;
    }

    public void setTraineeid(String traineeid) {
        this.traineeid = traineeid == null ? null : traineeid.trim();
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid == null ? null : comid.trim();
    }

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid = paperid == null ? null : paperid.trim();
    }

    public String getDepartadmin() {
        return departadmin;
    }

    public void setDepartadmin(String departadmin) {
        this.departadmin = departadmin == null ? null : departadmin.trim();
    }

    public Short getClasshour() {
        return classhour;
    }

    public void setClasshour(Short classhour) {
        this.classhour = classhour;
    }

    public Short getIfpass() {
        return ifpass;
    }

    public void setIfpass(Short ifpass) {
        this.ifpass = ifpass;
    }
}