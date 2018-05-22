package com.rsa.demo.repositories;

import com.rsa.demo.entities.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepository extends CrudRepository<ActivityEntity, Long> {

    ActivityEntity findById(long id);
}
