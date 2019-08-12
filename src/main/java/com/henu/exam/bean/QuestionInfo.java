package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QuestionInfo extends QuestionInfoKey implements Serializable {

    private String type;

    private String questionStem;

    private String option;

    private String answer;

    private String analysis;

    private Date creatorDate;

    private String note;

    private static final long serialVersionUID = 1L;

}