package com.example.Jwt_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Hello, Welcome to Jwt Project!";
    }
}
