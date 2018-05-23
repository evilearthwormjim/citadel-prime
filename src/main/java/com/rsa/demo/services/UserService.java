package com.rsa.demo.services;

import com.rsa.demo.entities.UserEntity;
import com.rsa.demo.models.UserModel;
import com.rsa.demo.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        List<UserModel> userList = new ArrayList<>();
        for(UserEntity entity : userRepository.findAll()){

           UserModel model = new UserModel();
           BeanUtils.copyProperties(entity, model);

           userList.add(model);
        }
        return userList;
    }

    public void saveUser(UserModel user){

        UserEntity newUser = new UserEntity();
        BeanUtils.copyProperties(user, newUser, "id");
        userRepository.save(newUser);

        user.setId(newUser.getId());
    }
}
