package com.example.spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
        System.out.println("Just test");
        System.out.println("pull from github");
        System.out.println("push to github  ssh");
        System.out.println("pull from github 2");
    }

}
