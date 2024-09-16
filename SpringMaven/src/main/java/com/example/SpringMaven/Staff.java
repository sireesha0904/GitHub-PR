package com.example.SpringMaven;

import org.springframework.stereotype.Component;

@Component("staff")
public class Staff implements CollegeInfo {

    private String name;
    private String position;

    public Staff() {
        this.name = "Mr. Prafulla kumar Panda";
        this.position = "Dean of Soet";
    }

    @Override
    public void Clginfo() {
        System.out.println("Staff Name: " + name + ", Position: " + position);
    }

    public String getName() {
        return this.name;  
    }
}
