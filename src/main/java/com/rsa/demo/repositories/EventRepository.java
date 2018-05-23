package com.rsa.demo.repositories;

import com.rsa.demo.entities.EventEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends CrudRepository<EventEntity, Long> {
    EventEntity findById(long id);
}
