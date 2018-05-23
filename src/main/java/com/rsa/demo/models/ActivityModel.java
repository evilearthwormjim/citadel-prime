package com.rsa.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class ActivityModel {

    @Getter @Setter
    private UUID id;

    @Getter @Setter
    @NotBlank
    private String name;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private boolean active;
}
