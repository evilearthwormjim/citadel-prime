package com.rsa.demo.entities;

import javax.persistence.*;

@Entity
public class UserActivity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long userId;

    @Column
    private long activityId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
