package com.cognizant.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") // This handles: http://localhost:8081/
    public String home() {
        return " Welcome to Spring REST!";
    }

    @GetMapping("/hello") // This handles: http://localhost:8081/hello
    public String hello() {
        return "Hello, Harshini!";
    }
}
