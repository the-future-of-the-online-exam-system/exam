package com.henu.exam.bean;

import java.io.Serializable;
import java.util.Date;

public class QuestionInfo implements Serializable {
    private String questionid;

    private Short questiontype;

    private String questionkey;

    private String questionresolve;

    private String questioncreater;

    private Date questiondate;

    private String note;

    private String questiondbid;

    private static final long serialVersionUID = 1L;

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }

    public Short getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(Short questiontype) {
        this.questiontype = questiontype;
    }

    public String getQuestionkey() {
        return questionkey;
    }

    public void setQuestionkey(String questionkey) {
        this.questionkey = questionkey == null ? null : questionkey.trim();
    }

    public String getQuestionresolve() {
        return questionresolve;
    }

    public void setQuestionresolve(String questionresolve) {
        this.questionresolve = questionresolve == null ? null : questionresolve.trim();
    }

    public String getQuestioncreater() {
        return questioncreater;
    }

    public void setQuestioncreater(String questioncreater) {
        this.questioncreater = questioncreater == null ? null : questioncreater.trim();
    }

    public Date getQuestiondate() {
        return questiondate;
    }

    public void setQuestiondate(Date questiondate) {
        this.questiondate = questiondate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getQuestiondbid() {
        return questiondbid;
    }

    public void setQuestiondbid(String questiondbid) {
        this.questiondbid = questiondbid == null ? null : questiondbid.trim();
    }
}