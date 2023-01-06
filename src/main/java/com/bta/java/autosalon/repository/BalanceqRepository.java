package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.balanceq.Balanceq;

import java.util.List;


//@Repository
public interface BalanceqRepository //extends JpaRepository <Balanceq, Long>
{

    List<Balanceq> findAll();


}
