package com.cskaoyan.bean;

public class Stu {
    String sname;
    Teacher teacher;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sname='" + sname + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
