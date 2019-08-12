package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class News implements Serializable {
    private String id;

    private String title;

    private String content;

    private Integer top;

    private String creator;

    private String picture;

    private Date date;

    private String note;

    private static final long serialVersionUID = 1L;

}