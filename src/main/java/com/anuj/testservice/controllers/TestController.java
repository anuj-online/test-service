package com.anuj.testservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("name/{name}")
    public String hello(String name){
        return String.format("Hello %s", name);
    }
}
