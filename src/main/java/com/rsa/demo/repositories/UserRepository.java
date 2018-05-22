package com.rsa.demo.repositories;

import com.rsa.demo.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    public UserEntity findById(long id);
}
