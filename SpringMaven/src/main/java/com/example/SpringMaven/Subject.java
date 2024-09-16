package com.example.SpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Subject {

    private final Staff staff;
    private final Faculty faculty;
    private final StudentInfo student;

    
    @Autowired
    public Subject(Staff staff, Faculty faculty, StudentInfo student) {
        this.staff = staff;
        this.faculty = faculty;
        this.student = student;
    }

    
    public void displaySubjectDetails() {
        System.out.println("Faculty " + faculty.getName() + " is teaching Java.");
        System.out.println("Staff " + staff.getName() + " is assisting with the Java subject.");
        System.out.println("Student " + student.getName() + " is enrolled in the Java subject.");
    }
}
