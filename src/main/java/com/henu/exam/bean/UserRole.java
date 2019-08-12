package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRole implements Serializable {
    private String id;

    private String userId;

    private String roleId;

    private static final long serialVersionUID = 1L;

}