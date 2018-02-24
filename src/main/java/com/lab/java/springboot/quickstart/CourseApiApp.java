package com.lab.java.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Tells Spring that this is the starting point of the spring application
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);


    }
}
