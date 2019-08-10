package com.henu.exam.bean;

import java.io.Serializable;

public class PaperInfo implements Serializable {
    private String id;

    private String name;

    private int status;

    private String begdate;

    private String enddate;

    private int duration;

    private int totalscore;

    private String remark;

    private String qurstiondbid;

    private String poster;

    private int showmode;

    private String creator;

    private int totalq0num;

    private int totalq1num;

    private int totalq2num;

    private int totalq3num;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBegdate() {
        return begdate;
    }

    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getQurstiondbid() {
        return qurstiondbid;
    }

    public void setQurstiondbid(String qurstiondbid) {
        this.qurstiondbid = qurstiondbid == null ? null : qurstiondbid.trim();
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public int getShowmode() {
        return showmode;
    }

    public void setShowmode(int showmode) {
        this.showmode = showmode;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public int getTotalq0num() {
        return totalq0num;
    }

    public void setTotalq0num(int totalq0num) {
        this.totalq0num = totalq0num;
    }

    public int getTotalq1num() {
        return totalq1num;
    }

    public void setTotalq1num(int totalq1num) {
        this.totalq1num = totalq1num;
    }

    public int getTotalq2num() {
        return totalq2num;
    }

    public void setTotalq2num(int totalq2num) {
        this.totalq2num = totalq2num;
    }

    public int getTotalq3num() {
        return totalq3num;
    }

    public void setTotalq3num(int totalq3num) {
        this.totalq3num = totalq3num;
    }
}