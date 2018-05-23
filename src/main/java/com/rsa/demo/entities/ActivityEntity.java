package com.rsa.demo.entities;


import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;


@Entity
public class ActivityEntity {

    // Use a GUID rather than an ID
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Getter
    @Setter
    @Column
    private String name;

    @Getter @Setter
    @Column
    private String description;

    @Getter @Setter
    @Column
    private boolean active;

    public UUID getId() {
        return id;
    }
}
