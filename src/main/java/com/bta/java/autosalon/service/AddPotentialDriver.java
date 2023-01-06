package com.bta.java.autosalon.service;

import com.bta.java.autosalon.model.driver.DriverPotential;
import com.bta.java.autosalon.repository.DriverPotentialRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Service
public class AddPotentialDriver {


    @Autowired
    private DriverPotentialRepository driverPotentialRepository;

    public void addPotentialDriver(DriverPotential driverPotential) {


    }


}