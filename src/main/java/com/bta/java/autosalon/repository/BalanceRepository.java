package com.bta.java.autosalon.repository;

import com.bta.java.autosalon.model.balance.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BalanceRepository //extends JpaRepository<Balance, Long>
{

    //@Query("select bl from com.bta.java.autosalon.model.balance.Balance bl order by transaction_time desc")
    List<Balance> findAllOrderedByTransactionTime();

    Balance findOneByCarIdAndSummLessThan(Long carId,Long summ);

}
