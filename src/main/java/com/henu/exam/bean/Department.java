package com.henu.exam.bean;

import java.io.Serializable;

public class Department implements Serializable {
    private String id;

    private String name;

    private Short persons;

    private String note;

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

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", persons=" + persons +
                ", note='" + note + '\'' +
                '}';
    }
}