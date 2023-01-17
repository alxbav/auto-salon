package com.bta.java.autosalon.model.carq;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Date;

import static javax.persistence.GenerationType.IDENTITY;


@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "transaction")

@Entity
@Table(name = "carq")


public class Carq {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    public Boolean active;

    @Column(name = "q_rent")
    public Boolean qRent;

    @Column(name = "reg_number")
    public String regNumber;

    @Column(name = "release_date")
    public Date releaseDate;


    @Enumerated(EnumType.STRING)
    public EnumType manufacturer;

    @Enumerated(EnumType.STRING)
    @Column(name = "model")
    public EnumType bodyType;

    public Boolean appropriation;

    public Boolean elegance;

    @Enumerated(EnumType.STRING)
    @Column(name = "gear_type")
    public EnumType gearType;

    @Enumerated(EnumType.STRING)
    @Column(name = "fuel_type")
    public EnumType fuelType;

    public Boolean lpg;

    @Column(name = "date_install_lpg")
    public Date dateInstallLpg;

    @Column(name = "insurance_firm")
    public String insuranceFirm;

    @Column(name = "insurance_end")
    public Date insuranceEnd;

    @Column(name = "s_card")
    public Boolean sCard;

    public Boolean key2;

    public Boolean gps;

    @Column(name = "technical_inspection_end")
    public Date technicalInspectionEnd;

    @Column(name = "gas_inspection_end")
    public Date gasInspectionEnd;

    public String comments;


    // @OneToMany(mappedBy = "car")
    // private List<Balance> transactions;


}
