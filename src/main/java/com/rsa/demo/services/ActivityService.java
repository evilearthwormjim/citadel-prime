package com.rsa.demo.services;

import com.rsa.demo.entities.ActivityEntity;
import com.rsa.demo.models.ActivityModel;
import com.rsa.demo.repositories.ActivityRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

//    @Autowired - prefer constructor injection to @Autowired as per Dan's guidelines, slide 37
    ActivityRepository repository;

    public ActivityService( ActivityRepository repository) {
         this.repository = repository;
    }

    public void save(ActivityModel activityMdl){
        ActivityEntity activityEnt = new ActivityEntity();
        BeanUtils.copyProperties(activityMdl, activityEnt, "id");
        repository.save(activityEnt);
    }

    public List<ActivityModel> findAll() {
        List<ActivityModel> models = new ArrayList<>();
        for(ActivityEntity entity : repository.findAll()) {
            ActivityModel model = new ActivityModel();
            BeanUtils.copyProperties(entity, model);
            models.add(model);
        }
        return models;
    }

    public ActivityModel find(Long id) {
        ActivityEntity entity = repository.findById(id).get();
        ActivityModel model = new ActivityModel();
        BeanUtils.copyProperties(entity, model);
        return model;
    }
}
