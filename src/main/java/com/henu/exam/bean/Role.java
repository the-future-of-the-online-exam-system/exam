package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private String id;

    private String name;

    private static final long serialVersionUID = 1L;

}