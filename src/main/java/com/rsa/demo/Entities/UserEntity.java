package com.rsa.demo.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String email;

}
