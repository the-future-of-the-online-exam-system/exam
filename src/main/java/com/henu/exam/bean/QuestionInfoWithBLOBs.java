package com.henu.exam.bean;

import java.io.Serializable;

public class QuestionInfoWithBLOBs extends QuestionInfo implements Serializable {
    private String questioncontent;

    private String questiondata;

    private static final long serialVersionUID = 1L;

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }

    public String getQuestiondata() {
        return questiondata;
    }

    public void setQuestiondata(String questiondata) {
        this.questiondata = questiondata == null ? null : questiondata.trim();
    }
}