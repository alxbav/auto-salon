package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.carq.*;
import com.bta.java.autosalon.model.carq.GearType;
import com.bta.java.autosalon.model.carq.BodyType;
import com.bta.java.autosalon.model.carq.Carq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarqRepository extends JpaRepository<Carq, Long> {

 /*   List<Carq> findByGearTypeAndAndFuelTypeAAndBodyType(GearType gearType
            , FuelType fuelType
            , BodyType bodyType
    );*/

}
