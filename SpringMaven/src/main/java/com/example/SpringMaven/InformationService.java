package com.example.SpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("informationService")
public class InformationService {

    @Autowired
    private StudentInfo student;

    @Autowired
    private Faculty faculty;

    public void displayInformation() {
        System.out.println(student.toString());
        System.out.println(faculty.toString());
    }
}

