package com.bta.java.autosalon.model.place;


import com.bta.java.autosalon.model.car.Car;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
//@Entity
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

 //   @Column(name = "car_id")
 //   private long carId;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;


}
