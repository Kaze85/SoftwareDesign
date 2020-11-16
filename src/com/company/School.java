package com.company;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private String name;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public School (String name) {
        this.students = new ArrayList<Student>();

        this.name = name;
    }

    public void entrance(Student student) {
        this.students.add(student);
    }

    public String getStudentPass() {
        StringBuilder builder = new StringBuilder();
        for (Student student: this.students) {
            HzPass pass = new HzPass(student);
            String str = pass.toString();
            builder.append(str);
        }

        return builder.toString();
    }
}
