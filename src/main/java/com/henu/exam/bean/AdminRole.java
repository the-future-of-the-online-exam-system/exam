package com.henu.exam.bean;

import java.io.Serializable;

public class AdminRole implements Serializable {
    private String adminroleid;

    private String adminid;

    private String adminprivilege;

    private static final long serialVersionUID = 1L;

    public String getAdminroleid() {
        return adminroleid;
    }

    public void setAdminroleid(String adminroleid) {
        this.adminroleid = adminroleid == null ? null : adminroleid.trim();
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminprivilege() {
        return adminprivilege;
    }

    public void setAdminprivilege(String adminprivilege) {
        this.adminprivilege = adminprivilege == null ? null : adminprivilege.trim();
    }
}