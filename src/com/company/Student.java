package com.company;

public class Student {
    private String name;
    private int age;
    private int studentNumber;
    private String favCourse;

    Student (String name, int age, int studentNumber, String favCourse) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
        this.favCourse = favCourse;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFavCourse() {
        return favCourse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFavCourse(String favCourse) {
        this.favCourse = favCourse;
    }
}
