package com.henu.exam.bean;

import java.io.Serializable;
import java.util.Date;

public class Trainee implements Serializable {
    private String traineeid;

    private String traineename;

    private String departid;

    private String comid;

    private String phone;

    private String title;

    private String position;

    private String email;

    private String salt;

    private Date date;

    private Short status;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getTraineeid() {
        return traineeid;
    }

    public void setTraineeid(String traineeid) {
        this.traineeid = traineeid == null ? null : traineeid.trim();
    }

    public String getTraineename() {
        return traineename;
    }

    public void setTraineename(String traineename) {
        this.traineename = traineename == null ? null : traineename.trim();
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid == null ? null : departid.trim();
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid == null ? null : comid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}