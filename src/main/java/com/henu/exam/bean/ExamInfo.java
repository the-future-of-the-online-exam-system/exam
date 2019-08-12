package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExamInfo implements Serializable {
    private String id;

    private String name;

    private Integer status;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private Integer totalScore;

    private String description;

    private Integer questionDbId;

    private Date createDate;

    private Integer showMode;

    private String creator;

    private Integer multipleNum;

    private Integer singleNum;

    private Integer blankNum;

    private Integer judgeNum;

    private String note;

    private static final long serialVersionUID = 1L;

}