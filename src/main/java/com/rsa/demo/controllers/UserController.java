package com.rsa.demo.controllers;

import com.rsa.demo.models.UserModel;
import com.rsa.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    List<UserModel> getAll(){

        return userService.getAllUsers();
    }


    @GetMapping("{id}")
    UserModel getUser(@PathVariable Long id){

        return userService.getUser(id);
    }

    @PostMapping
    UserModel create(@Valid @RequestBody UserModel user){

        userService.saveUser(user);

        return user;
    }

}
