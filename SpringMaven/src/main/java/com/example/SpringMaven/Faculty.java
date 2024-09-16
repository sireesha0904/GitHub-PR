package com.example.SpringMaven;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("faculty")
@Primary
public class Faculty implements CollegeInfo {

    private String name;
    private String department;

    public Faculty() {
        this.name = "Dr. Debendra Maharana";
        this.department = "Computer Science Engineering";
    }

    @Override
    public void Clginfo() {
        System.out.println("Faculty Name: " + name + ", Department: " + department);
    }

	public String getName() {
		return "Dr. Debendra Maharana";
	}
}
