package com.example.SpringMaven;

import org.springframework.stereotype.Component;

@Component("student")
public class StudentInfo implements CollegeInfo {

    private String name;
    private String rollNumber;
    private String branch;

    public StudentInfo() {
        this.name = "Modi Sireesha";
        this.rollNumber = "220101120146";
        this.branch = "CSE";
    }

    @Override
    public void Clginfo() {
        System.out.println("Student Name: " + name + ", Roll Number: " + rollNumber + ", Branch: " + branch);
    }

	public String getName() {
	
		return "Modi Sireesha";
	}
}
