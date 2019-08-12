package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String id;

    private String username;

    private String password;

    private String department;

    private String com;

    private String title;

    private String phone;

    private String position;

    private String email;

    private Integer status;

    private Date createDate;

    private String note;

    private static final long serialVersionUID = 1L;

}