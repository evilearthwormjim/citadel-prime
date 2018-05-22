package com.rsa.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserActivity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long userId;

    @Column
    private long activityId;
}
