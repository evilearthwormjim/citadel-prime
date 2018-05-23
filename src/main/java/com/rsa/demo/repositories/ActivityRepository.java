package com.rsa.demo.repositories;

import com.rsa.demo.entities.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

// Using a REST Controller overrides the behavior added by the RepositoryRestResource annotation
// But RepositoryRestResource returns a response that matches the JSON spec, similar to Katharsis
@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepository extends CrudRepository<ActivityEntity, Long> {

    Optional<ActivityEntity> findById(Long id);
}
