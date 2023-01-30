package com.helloSpring.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {
    
    @GetMapping
    public String hello(){
        return "Olá Springaa12";
    }
}
