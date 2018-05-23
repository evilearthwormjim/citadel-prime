package com.rsa.demo.services;

import com.rsa.demo.entities.UserEntity;
import com.rsa.demo.models.UserModel;
import com.rsa.demo.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void CreateShouldSaveUserModelAsEntity(){

        UserModel userModel = new UserModel();


        userModel.setUsername("pob");
        userModel.setPassword("password");

        userService.saveUser(userModel);

        UserEntity user = new UserEntity();

        user.setUsername("pob");
        user.setPassword("password");

        verify(userRepository, times(1)).save(refEq(user));


    }
}
