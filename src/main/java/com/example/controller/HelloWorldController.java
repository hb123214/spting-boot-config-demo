package com.example.controller;

import com.example.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        Person person = new Person();
        System.out.println(person);
        return "Spring Boot HelloWorld";
    }



}
