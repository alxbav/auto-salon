package com.bta.java.autosalon.web.dto;

import lombok.Data;

@Data
public class DriverPotentialRequestDto {
    private String firstName;
    private String lastName;
    private String phone;
    private String active;
    private String comment;
}
