package com.anuj.testservice.controllers;

import com.anuj.testservice.repository.UserEntity;
import com.anuj.testservice.repository.UserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final UserRepo userRepo;

    public TestController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("name/{name}")
    public String hello(String name){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userRepo.save(userEntity);
        return String.format("Hello %s", name);
    }
}
