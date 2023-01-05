package com.bta.java.autosalon.repository;


import com.bta.java.autosalon.model.driverq.Driverq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverqRepository extends JpaRepository<Driverq, Long> {

    List<Driverq> findAll();


}
