package com.rsa.demo.services;

import com.rsa.demo.entities.UserEntity;
import com.rsa.demo.models.UserModel;
import com.rsa.demo.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(UserModel user){

        UserEntity newUser = new UserEntity();
        BeanUtils.copyProperties(user, newUser, "id");
        userRepository.save(newUser);

        user.setId(newUser.getId());
    }
}
