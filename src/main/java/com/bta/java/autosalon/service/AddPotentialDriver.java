package com.bta.java.autosalon.service;

import com.bta.java.autosalon.model.driverq.DriverqPotencial;
import com.bta.java.autosalon.repository.DriverqPotencialRepository;
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
    private DriverqPotencialRepository driverqPotencialRepository;

    public void addPotentDriverq(DriverqPotencial driverqPotencial) {


    }


}