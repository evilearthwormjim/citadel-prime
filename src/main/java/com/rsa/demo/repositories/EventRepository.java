package com.rsa.demo.repositories;

import com.rsa.demo.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends CrudRepository<Event, Long> {
    Event findById(long id);
}
