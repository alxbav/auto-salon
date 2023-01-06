package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.driverq.DriverPotencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DriverqPotencialRepository extends JpaRepository<DriverPotencial, Long> {


   List<DriverPotencial> findByPhone(String phone);



}
