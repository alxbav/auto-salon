package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.driver.DriverPotential;
import com.bta.java.autosalon.model.driver.DriverPotential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DriverPotentialRepository extends JpaRepository<DriverPotential, Long> {


   List<DriverPotential> findByPhone(String phone);



}
