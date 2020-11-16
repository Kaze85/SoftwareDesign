package com.company;

public class HzPass {
    private Student student;

    public HzPass(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String message = "Student number is " + student.getStudentNumber() + "and student name is " + student.getName();
        return message;
    }

}
