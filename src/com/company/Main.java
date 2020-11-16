package com.company;

public class Main {
    public static void main(String[] args) {
	    Console console = new Console();

        console.log("Hello World");

        console.log("Welcome to this script");

	    console.log("It is 6:00");
	    Student studentOne = new Student("Kaycee", 21, 1234567, "yes");
        Student studentTwo = new Student("Alex", 21, 7654321, "no");

	    Student[] students = {studentOne, studentTwo};
        console.log("We have" + students.length + "students:");

        for (Student student: students) {
            console.log(student.getName());
        }

        School school = new School("HZ");

        school.entrance(students[0]);
        console.log(school.getStudentPass());
    }
}
