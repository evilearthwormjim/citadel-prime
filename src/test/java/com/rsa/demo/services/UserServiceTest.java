package com.rsa.demo.services;

import com.rsa.demo.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;
    
    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void CreateShouldSaveUserModelAsEntity(){




    }
}
