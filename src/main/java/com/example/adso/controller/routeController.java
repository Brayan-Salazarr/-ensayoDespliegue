package com.example.adso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class routeController {
    
    @GetMapping("/")
    public String home() {
        return "API funcionando correctamente";
    }
}