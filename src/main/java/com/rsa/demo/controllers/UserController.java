package com.rsa.demo.controllers;

import com.rsa.demo.models.UserModel;
import com.rsa.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    UserModel create(@Valid @RequestBody UserModel user){

        userService.saveUser(user);

        return user;
    }

}
