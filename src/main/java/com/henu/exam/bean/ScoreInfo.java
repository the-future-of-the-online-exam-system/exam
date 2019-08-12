package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ScoreInfo implements Serializable {

    private String id;

    private String examId;

    private String accountId;

    private Integer examScore;

    private Integer score;

    private String note;

    private static final long serialVersionUID = 1L;

}