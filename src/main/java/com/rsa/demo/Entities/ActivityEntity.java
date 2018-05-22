package com.rsa.demo.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class ActivityEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column
    private String name;

    @Getter @Setter
    @Column
    private String description;

    @Getter @Setter
    @Column
    private boolean active;
}
