package com.rsa.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserActivityEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long userId;

    @Column
    private long activityId;
}
