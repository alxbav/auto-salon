package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.car.*;
import com.bta.java.autosalon.model.car.GearType;
import com.bta.java.autosalon.model.car.BodyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface RemontRepository //extends JpaRepository<Car, Long>
{

    List<Car> findByGearTypeAndFuelType(GearType gearType, FuelType fuelType);

}
