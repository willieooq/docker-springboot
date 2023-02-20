package com.example.hellospringworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LognController {
    @GetMapping("/login")
    public String login(){
        return "Hello Springboot";
    }
}
