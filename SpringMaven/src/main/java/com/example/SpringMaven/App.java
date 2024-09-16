package com.example.SpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    private final CollegeInfo clg;
    private final Subject subject;

    
    @Autowired
    public App(@Qualifier("student") CollegeInfo clg, Subject subject) {
        this.clg = clg;
        this.subject = subject;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = context.getBean(App.class);
        app.run();
        app.displaySubjectDetails(); 
    }

    public void run() {
        clg.Clginfo();
    }

    
    public void displaySubjectDetails() {
        subject.displaySubjectDetails();
    }
}
