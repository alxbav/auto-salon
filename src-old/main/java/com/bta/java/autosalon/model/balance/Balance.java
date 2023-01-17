package com.bta.java.autosalon.model.balance;


import com.bta.java.autosalon.model.car_old.Car;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
//@Entity
@ToString (exclude = "car")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    private Long summ;

    private Long balance;

    //    @Column(name = "car_id")
     //private long carId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;



}
