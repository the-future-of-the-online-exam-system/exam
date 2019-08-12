package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Department implements Serializable {

    private String id;

    private String comName;

    private String name;

    private Integer num;

    private String note;

    private static final long serialVersionUID = 1L;

}