package com.rsa.demo.controllers;

import com.rsa.demo.models.ActivityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    com.rsa.demo.Services.ActivityService service;

    @PostMapping
    ActivityModel create(@Valid @RequestBody ActivityModel activityMdl){
        service.save(activityMdl);
        return activityMdl;
    }
}
