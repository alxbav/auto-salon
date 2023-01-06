package com.bta.java.autosalon.model.car_old;

import lombok.*;
import lombok.experimental.SuperBuilder;
import com.bta.java.autosalon.model.balance.Balance;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


//@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude =  "transaction")
@Table(name = "car")
//@Table(name = "CAR") esli imia tablicy i classa odinakovy - to eto ne nado

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String color;

    @Enumerated(EnumType.STRING)
    @Column(name = "body_type")
    private BodyType bodyType;

    @Enumerated(EnumType.STRING)
    @Column(name = "manufacturer")
    private Manufacturer manufacturer;


    private String regNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "gear_type")
    private GearType gearType;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type")
    private FuelType fuelType;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    private String description;

    @OneToMany(mappedBy = "car")
    private List<Balance> transactions;



}
