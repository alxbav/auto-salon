package com.bta.java.autosalon.web.controller;


import ch.qos.logback.core.pattern.PostCompileProcessor;
import com.bta.java.autosalon.model.balanceq.Balanceq;
import com.bta.java.autosalon.model.driverq.Driverq;
import com.bta.java.autosalon.repository.BalanceqRepository;
import com.bta.java.autosalon.repository.DriverqRepository;
import org.springframework.stereotype.Controller;
import com.bta.java.autosalon.model.car.Car;
import com.bta.java.autosalon.model.carq.Carq;
import com.bta.java.autosalon.repository.CarRepository;
import com.bta.java.autosalon.repository.CarqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller

public class RegistrationController {
   // @Autowired
    public DriverqRepository driverqRepository;
    public CarqRepository carqRepository;
    private BalanceqRepository balanceqRepository;

    @GetMapping("/registration")
    public ModelAndView regAdd(Model model) {
        ModelAndView result = new ModelAndView("/registration/balanceq_add");
        return result;
    }

   @PostMapping("/registration")
    public String balanceqPostAdd(@RequestParam String week_number,
                                  @RequestParam String date,
                                  @RequestParam String driver_id,
                                  @RequestParam String summ,
                                  @RequestParam String transaction_type,
                                  @RequestParam String comments) {
        Balanceq balanceq = new Balanceq(week_number, date, driver_id, summ, transaction_type, comments);
        //balanceqRepository.save(balanceq);
        return "redirect:/index.ftl";
    }

/*    @PostMapping("registration/balanceq_add")
    public String balanceqPostAdd1(@RequestParam String week_number,
                                  @RequestParam String date,
                                  @RequestParam String driver_id,
                                  @RequestParam String summ,
                                  @RequestParam String transaction_type,
                                  @RequestParam String comments) {
        Balanceq balanceq = new Balanceq(week_number, date, driver_id, summ, transaction_type, comments);
        balanceqRepository.save(balanceq);
        return "redirect:/";
    }
*/
    @GetMapping("/registration/balanceq_add")
    public ModelAndView regAdd1(Model model) {
        ModelAndView result = new ModelAndView("registration/balanceq_add");
        return result;
    }

}
