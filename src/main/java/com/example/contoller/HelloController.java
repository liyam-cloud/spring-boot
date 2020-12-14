package com.example.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${demo.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello " + name + " !";
    }
}
