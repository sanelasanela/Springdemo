package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestCOntroller {

    @GetMapping(name= "/world")
    public String helloWorld(){
        return "hello sanela";
    }
}
