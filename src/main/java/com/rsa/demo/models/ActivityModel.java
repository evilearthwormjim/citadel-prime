package com.rsa.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

public class ActivityModel {

    @Getter @Setter
    private long id;

    @Getter @Setter
    @NotBlank
    private String name;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private boolean active;
}
