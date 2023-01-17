package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.car_old.*;
import com.bta.java.autosalon.model.car_old.GearType;

import java.util.List;

//@Repository
public interface CarRepository  ///extends JpaRepository<Car, Long>
{



    List<Car> findByGearTypeAndFuelType(GearType gearType, FuelType fuelType);
}


