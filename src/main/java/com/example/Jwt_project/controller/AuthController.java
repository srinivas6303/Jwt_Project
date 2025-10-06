package com.example.Jwt_project.controller;

import com.example.Jwt_project.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password){
        if("srinivas".equals(username) && "Srinu@123".equals(password)){
            return jwtUtil.generateToken(username);
        }
        return "Invalid Credentials!";
    }
}
