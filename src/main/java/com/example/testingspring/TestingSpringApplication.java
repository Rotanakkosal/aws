package com.example.testingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestingSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestingSpringApplication.class, args);
    }
    @GetMapping("/")
    public String Hello (){
        return "Hello My fri magic is my crush!";
    }

}





