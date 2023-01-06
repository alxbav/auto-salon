package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.balanceq.Balanceq;
import com.bta.java.autosalon.repository.BalanceqRepository;
import com.bta.java.autosalon.repository.DriverqRepository;
import org.springframework.stereotype.Controller;
import com.bta.java.autosalon.model.car.Car;
import com.bta.java.autosalon.model.carq.Carq;
import com.bta.java.autosalon.repository.CarRepository;
import com.bta.java.autosalon.repository.CarqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BalanceqController {

    //@Autowired
    private BalanceqRepository balanceqRepository;

/*   @PostMapping("/registration")
    public String balanceqPostAdd3(@RequestParam String week_number,
                                  @RequestParam String date,
                                  @RequestParam String driver_id,
                                  @RequestParam String summ,
                                  @RequestParam String transaction_type,
                                  @RequestParam String comments) {
        Balanceq balanceq = new Balanceq(week_number, date, driver_id, summ, transaction_type, comments);
        balanceqRepository.save(balanceq);
        return "redirect:/balanceq_add";
    }

*/




    @GetMapping ("/balanceq")
    public ModelAndView getAllBalanceq(){
        Map<String, Object> model = new HashMap<>();
        List<Balanceq> availableBalanceq = balanceqRepository.findAll();
        model.put("balanceq", availableBalanceq);
        ModelAndView result = new ModelAndView("balanceq/balanceq", model);
        return result;

    }

}
