package com.henu.exam.bean;

import java.io.Serializable;

public class Company implements Serializable {
    private String comid;

    private String comname;

    private Short compersons;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid == null ? null : comid.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
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
}