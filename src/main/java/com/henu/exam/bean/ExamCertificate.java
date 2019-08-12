package com.henu.exam.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExamCertificate implements Serializable {
    private String id;

    private String accountId;

    private String comId;

    private String examId;

    private Integer qualified;

    private static final long serialVersionUID = 1L;

}