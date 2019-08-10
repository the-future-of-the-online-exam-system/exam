package com.henu.exam.bean;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private String questionsdbid;

    private String questiondbname;

    private Date createdate;

    private String poster;

    private static final long serialVersionUID = 1L;

    public String getQuestionsdbid() {
        return questionsdbid;
    }

    public void setQuestionsdbid(String questionsdbid) {
        this.questionsdbid = questionsdbid == null ? null : questionsdbid.trim();
    }

    public String getQuestiondbname() {
        return questiondbname;
    }

    public void setQuestiondbname(String questiondbname) {
        this.questiondbname = questiondbname == null ? null : questiondbname.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster == null ? null : poster.trim();
    }
}