package com.henu.exam.bean;

import java.io.Serializable;

public class DepartAdminRole implements Serializable {
    private String departadminrole;

    private String departadminid;

    private String departadminprivilege;

    private static final long serialVersionUID = 1L;

    public String getDepartadminrole() {
        return departadminrole;
    }

    public void setDepartadminrole(String departadminrole) {
        this.departadminrole = departadminrole == null ? null : departadminrole.trim();
    }

    public String getDepartadminid() {
        return departadminid;
    }

    public void setDepartadminid(String departadminid) {
        this.departadminid = departadminid == null ? null : departadminid.trim();
    }

    public String getDepartadminprivilege() {
        return departadminprivilege;
    }

    public void setDepartadminprivilege(String departadminprivilege) {
        this.departadminprivilege = departadminprivilege == null ? null : departadminprivilege.trim();
    }
}