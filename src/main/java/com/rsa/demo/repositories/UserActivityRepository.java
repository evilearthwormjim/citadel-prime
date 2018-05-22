package com.rsa.demo.repositories;

import com.rsa.demo.entities.UserActivity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userActivities", path = "userActivities")
public interface UserActivityRepository extends CrudRepository<UserActivity, Long> {
    UserActivity findById(long id);
}
