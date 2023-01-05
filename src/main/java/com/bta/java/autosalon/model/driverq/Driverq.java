package com.bta.java.autosalon.model.driverq;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


//@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "transaction")

@Entity
@Table(name = "driverq")
public class Driverq {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    public Boolean active;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    public String phone;

    public String email;

    public BigInteger isikukood;

    public String iban1;
    public String iban2;
    public String iban3;

    @Column(name = "driver_license_number")
    public String driverLicenseNumber;

    @Column(name = "driver_license_exp")
    public Date driverLicenseExp;

    @Column(name = "taxi_license")
    public String taxiLicense;

    public String address;

    public String comments;

}
