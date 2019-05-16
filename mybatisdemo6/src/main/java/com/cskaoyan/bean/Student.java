package com.cskaoyan.bean;

import java.util.List;

/**
 * @author Keniefu
 * @date 2019/5/14
 */
public class Student {
    private int id;
    private String name;
    private List<Course> courses;
    private Teacher teacher;

    public Student() {
    }

    public Student(int id, String name, List<Course> courses, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", teacher=" + teacher +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getcourses() {
        return courses;
    }

    public void setcourses(List<Course> courses) {
        this.courses = courses;
    }
}
