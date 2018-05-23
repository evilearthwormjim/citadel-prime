package com.rsa.demo.controllers;

import com.rsa.demo.models.ActivityModel;
import com.rsa.demo.services.ActivityService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @PostMapping
    ActivityModel create(@Valid @RequestBody ActivityModel activityMdl){
        service.save(activityMdl);
        return activityMdl;
    }

    @GetMapping
    List<ActivityModel> getAll(){
        return service.findAll();
    }
}
