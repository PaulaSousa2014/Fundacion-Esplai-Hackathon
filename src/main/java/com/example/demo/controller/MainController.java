package com.example.demo.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String home() {
        return "Login & Register server";
    }
    
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/api/users")
    public String users() {
        return "Welcome to Users Area";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/api/admin")
    public String admin() {
        return "Welcome to Admin Area";
    }
    
}
