package com.bta.java.autosalon.model.balanceq;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


//@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "transaction")
@Table(name = "balanceq")


public class Balanceq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public String week_number;


    public String date;


    public String driver_id;


    public String summ;


    public String transaction_type;


    public String comments;


    public Balanceq(String week_number, String date, String driver_id, String summ,
                    String transaction_type, String comments) {
        this.week_number = week_number;
        this.date = date;
        this.driver_id = driver_id;
        this.summ = summ;
        this.transaction_type = transaction_type;
        this.comments = comments;
    }

}
