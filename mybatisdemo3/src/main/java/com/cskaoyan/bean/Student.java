package com.cskaoyan.bean;

/**
 * Student class
 * @author Keniefu
 * @date 2019/5/11
 */
public class Student {
    private int idx;
    private String name;
    private String gender;
    private int agex;
    private int lazy;
    private int deleted;

    public Student() {
    }

    public Student(int idx, String name, String gender, int agex, int lazy, int deleted) {
        this.idx = idx;
        this.name = name;
        this.gender = gender;
        this.agex = agex;
        this.lazy = lazy;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", agex=" + agex +
                ", lazy=" + lazy +
                ", deleted=" + deleted +
                '}';
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAgex() {
        return agex;
    }

    public void setAgex(int agex) {
        this.agex = agex;
    }

    public int getLazy() {
        return lazy;
    }

    public void setLazy(int lazy) {
        this.lazy = lazy;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
