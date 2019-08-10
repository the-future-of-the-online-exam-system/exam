package com.henu.exam.bean;

import java.io.Serializable;

public class Company implements Serializable {
    private String id;

    private String name;

    private Short compersons;

    private String note;

    private String comname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getCompersons() {
        return compersons;
    }

    public void setCompersons(Short compersons) {
        this.compersons = compersons;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", compersons=" + compersons +
                ", note='" + note + '\'' +
                ", comname='" + comname + '\'' +
                '}';
    }
}