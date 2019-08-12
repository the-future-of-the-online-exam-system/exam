package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Question implements Serializable {
    private String id;

    private String name;

    private Date createDate;

    private String creator;

    private static final long serialVersionUID = 1L;

}