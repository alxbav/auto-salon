package com.bta.java.autosalon.model.driverq;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "transaction")

@Entity
@Table(name = "driverq_potential")
public class DriverPotencial {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    public String phone;

    public String active1;

    public String comments;
}