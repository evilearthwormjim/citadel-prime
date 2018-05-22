package com.rsa.demo.services;

import com.rsa.demo.entities.ActivityEntity;
import com.rsa.demo.models.ActivityModel;
import com.rsa.demo.repositories.ActivityRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActivityService {

    @Autowired
    ActivityRepository repository;

    public void save(ActivityModel activityMdl){
        ActivityEntity activityEnt = new ActivityEntity();
        BeanUtils.copyProperties(activityMdl, activityEnt, "id");
        repository.save(activityEnt);
    }
}
