package com.cskaoyan.bean;

public class Course {
    String cname;

    public String getName() {
        return cname;
    }

    public void setCname(String name) {
        this.cname = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
