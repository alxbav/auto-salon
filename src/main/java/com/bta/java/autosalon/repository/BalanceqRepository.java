package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.balanceq.Balanceq;
import com.bta.java.autosalon.model.driverq.Driverq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public interface BalanceqRepository //extends JpaRepository <Balanceq, Long>
{

    List<Balanceq> findAll();


}
