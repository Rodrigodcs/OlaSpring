package com.helloSpring.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {
    
    @GetMapping
    public String hello(){
<<<<<<< HEAD
        return "Olá Springa";
=======
        return "Olá Springaa12";
>>>>>>> 87ae57d8e527b3f0e76a52b067422286e0d57884
    }
}
