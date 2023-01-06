package com.bta.java.autosalon.service.impl;

import com.bta.java.autosalon.model.driverq.DriverPotencial;
import com.bta.java.autosalon.repository.DriverqPotencialRepository;
import com.bta.java.autosalon.service.DriverPotentialService;
import com.bta.java.autosalon.web.dto.DriverPotentialRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverPotentialServiceImpl implements DriverPotentialService {

    @Autowired
    private DriverqPotencialRepository driverqPotencialRepository;

    @Override
    public void add(DriverPotentialRequestDto dto) {
        validate(dto);
        validateUniquenessByPhone(dto);
        final var entity = mapToEntity(dto);
        driverqPotencialRepository.save(entity);
    }


    private DriverPotencial mapToEntity(DriverPotentialRequestDto dto){
        return DriverPotencial.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .phone(dto.getPhone())
                .active1(dto.getActive())
                .comments(dto.getComment())
                .build();
    }

    private void validateUniquenessByPhone(DriverPotentialRequestDto dto){
        var drivers = driverqPotencialRepository.findByPhone(dto.getPhone());
        if(!drivers.isEmpty()) {
            throw new RuntimeException("Driver with MP already exists..");
        }
    }

    private void validate(DriverPotentialRequestDto dto){
        String firstName = dto.getFirstName();
        if(firstName==null || firstName.isEmpty()) {
            throw new RuntimeException("FirstName must be filled!!");
            //TODO ..
        }
        //check size

    }
}
