package com.cskaoyan.bean;

public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private Integer lazy;

    private Integer deleted;

    private String gender;

    private Integer teacherId;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer lazy, Integer deleted, String gender, Integer teacherId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lazy = lazy;
        this.deleted = deleted;
        this.gender = gender;
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLazy() {
        return lazy;
    }

    public void setLazy(Integer lazy) {
        this.lazy = lazy;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", lazy=" + lazy +
                ", deleted=" + deleted +
                ", gender='" + gender + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}