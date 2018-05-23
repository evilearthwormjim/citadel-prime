package com.rsa.demo.services;

import com.rsa.demo.entities.ActivityEntity;
import com.rsa.demo.models.ActivityModel;
import com.rsa.demo.repositories.ActivityRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class ActivityService {

//    @Autowired - prefer constructor injection as per Dan's guidelines, slide 37
    ActivityRepository repository;

    public ActivityService( ActivityRepository repository) {
         this.repository = repository;
    }

    public void save(ActivityModel activityMdl){
        ActivityEntity activityEnt = new ActivityEntity();
        BeanUtils.copyProperties(activityMdl, activityEnt, "id");
        repository.save(activityEnt);
    }
}
