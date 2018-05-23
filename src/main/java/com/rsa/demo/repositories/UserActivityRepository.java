package com.rsa.demo.repositories;

import com.rsa.demo.entities.UserActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "userActivities", path = "userActivities")
public interface UserActivityRepository extends CrudRepository<UserActivityEntity, Long> {
    UserActivityEntity findById(long id);
}
