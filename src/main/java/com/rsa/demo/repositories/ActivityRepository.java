package com.rsa.demo.repositories;

import com.rsa.demo.entities.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepository extends CrudRepository<ActivityEntity, UUID> {

    Optional<ActivityEntity> findById(UUID id);
}
