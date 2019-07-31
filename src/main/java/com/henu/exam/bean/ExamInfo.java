package com.henu.exam.bean;

import java.io.Serializable;
import java.util.Date;

public class ExamInfo extends ExamInfoKey implements Serializable {
    private Short papermark;

    private Date exambegdate;

    private Date examenddate;

    private Short examstatus;

    private String note;

    private static final long serialVersionUID = 1L;

    public Short getPapermark() {
        return papermark;
    }

    public void setPapermark(Short papermark) {
        this.papermark = papermark;
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

    public Short getExamstatus() {
        return examstatus;
    }

    public void setExamstatus(Short examstatus) {
        this.examstatus = examstatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}