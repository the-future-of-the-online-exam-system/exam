package com.henu.exam.bean;

import java.io.Serializable;

public class DepartmentRole implements Serializable {
    private String departid;

    private String departname;

    private Short persons;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public Short getPersons() {
        return persons;
    }

    public void setPersons(Short persons) {
        this.persons = persons;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}