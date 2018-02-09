package com.curtinhome.issuetracker.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IssueTracker {

    public static void main(String[] args) {
        SpringApplication.run(IssueTracker.class, args);
    }
}
