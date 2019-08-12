package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionInfoKey implements Serializable {

    private String id;

    private String questionDbId;

    private static final long serialVersionUID = 1L;

}