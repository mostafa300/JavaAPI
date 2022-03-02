package com.example.helloscp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloScpController {
   @GetMapping("/")
    public String hello() {
        return "Hello SCP from Spring Boot";
    }
}
