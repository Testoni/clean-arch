package com.example.cleanarch.controller;

import com.example.cleanarch.model.User;
import com.example.cleanarch.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // http POST :8080/users username=username password=password email=email
    @PostMapping
    User create(@RequestBody User user) {
        return userService.create(user);
    }



}
