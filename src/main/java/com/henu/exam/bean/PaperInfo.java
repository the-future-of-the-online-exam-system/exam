package com.henu.exam.bean;

import java.io.Serializable;
import java.util.Date;

public class PaperInfo implements Serializable {
    private String paperid;

    private String papername;

    private Short paperstatus;

    private Date exambegdate;

    private Date examenddate;

    private Short examduration;

    private Short totalscore;

    private String paperremark;

    private String examdata;

    private Date examposter;

    private Short papershowmode;

    private String papercreator;

    private static final long serialVersionUID = 1L;

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid = paperid == null ? null : paperid.trim();
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Short getPaperstatus() {
        return paperstatus;
    }

    public void setPaperstatus(Short paperstatus) {
        this.paperstatus = paperstatus;
    }

    public Date getExambegdate() {
        return exambegdate;
    }

    public void setExambegdate(Date exambegdate) {
        this.exambegdate = exambegdate;
    }

    public Date getExamenddate() {
        return examenddate;
    }

    public void setExamenddate(Date examenddate) {
        this.examenddate = examenddate;
    }

    public Short getExamduration() {
        return examduration;
    }

    public void setExamduration(Short examduration) {
        this.examduration = examduration;
    }

    public Short getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Short totalscore) {
        this.totalscore = totalscore;
    }

    public String getPaperremark() {
        return paperremark;
    }

    public void setPaperremark(String paperremark) {
        this.paperremark = paperremark == null ? null : paperremark.trim();
    }

    public String getExamdata() {
        return examdata;
    }

    public void setExamdata(String examdata) {
        this.examdata = examdata == null ? null : examdata.trim();
    }

    public Date getExamposter() {
        return examposter;
    }

    public void setExamposter(Date examposter) {
        this.examposter = examposter;
    }

    public Short getPapershowmode() {
        return papershowmode;
    }

    public void setPapershowmode(Short papershowmode) {
        this.papershowmode = papershowmode;
    }

    public String getPapercreator() {
        return papercreator;
    }

    public void setPapercreator(String papercreator) {
        this.papercreator = papercreator == null ? null : papercreator.trim();
    }
}