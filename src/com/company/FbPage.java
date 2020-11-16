package com.company;

public class FbPage {
    private Student student;

    public FbPage(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String message = "My name is" + student.getName() + ", my favourite course is" + student.getFavCourse() + ".";
        return message;
    }
}
