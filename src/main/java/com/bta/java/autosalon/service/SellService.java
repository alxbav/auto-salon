package com.bta.java.autosalon.service;

import com.bta.java.autosalon.model.balance.Balance;
import com.bta.java.autosalon.model.car.Car;
import com.bta.java.autosalon.repository.BalanceRepository;
import com.bta.java.autosalon.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class SellService {

    private static final double SELL_INTEREST = 1.15;
    //@Autowired
    private PlaceRepository placeRepository;

    //@Autowired
    private BalanceRepository balanceRepository;

    @Transactional
    public void sellCar(Car carToSell) {
        placeRepository.deleteByCar_Id(carToSell.getId());
        final long price = calculateSellPrice(carToSell);
       // final Balance latestTx = balanceRepository.findLatestTransaction();
      //  final long newBalance = price + latestTx.getBalance();

        final Balance transaction = Balance.builder()
       //         .balance(price + latestTx.getBalance())
                .date(LocalDateTime.now())
                .summ(price)
                .car(carToSell)
                .build();
        //balanceRepository.save(transaction);
    }

    private long calculateSellPrice(Car carToSell) {
        Balance buyTx = balanceRepository.findOneByCarIdAndSummLessThan(carToSell.getId(), 0L);
        Long sellPrice = (long) (Math.abs(buyTx.getSumm() * SELL_INTEREST));
        return sellPrice;
    }


}
