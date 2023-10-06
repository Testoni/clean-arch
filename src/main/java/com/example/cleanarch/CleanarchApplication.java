package com.example.cleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanarchApplication {

    public static void main(String[] args) {
        // http://localhost:8080/h2-console/
        // http POST :8080/users username=username password=password email=email
        SpringApplication.run(CleanarchApplication.class, args);
    }

}
