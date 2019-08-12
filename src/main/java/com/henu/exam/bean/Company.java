package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Company implements Serializable {
    private String id;

    private String name;

    private Integer num;

    private String note;

    private static final long serialVersionUID = 1L;

}