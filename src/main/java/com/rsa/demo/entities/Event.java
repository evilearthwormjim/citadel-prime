package com.rsa.demo.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String activityId;

    @Column
    private Date scheduledDate;

    @Column
    private boolean isActive;

    @Column
    private long ownerId;
}
