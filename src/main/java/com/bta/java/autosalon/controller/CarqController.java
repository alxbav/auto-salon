package com.bta.java.autosalon.controller;

import com.bta.java.autosalon.model.balanceq.Balanceq;
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



@Controller
public class CarqController {

    @Autowired
    private CarqRepository carqRepository;

    @GetMapping("/qrental_cars")
    public ModelAndView getAllCars() {
        Map<String, Object> model = new HashMap<>();
       List<Carq> availableCarq = carqRepository.findAll();
        model.put("carqs", availableCarq);
        ModelAndView result = new ModelAndView("qrental_cars/qrental_cars", model);
        return result;
    }

    @GetMapping("/qrental_cars/carq-add")
    public ModelAndView carqregAdd(Model model) {
        ModelAndView result = new ModelAndView("/qrental_cars/carq-add");
        return result;
    }

    @PostMapping("/qrental_cars/carq-add")
    public String carqPostAdd(@RequestParam String active,
                              @RequestParam String qRent,
                              @RequestParam String regNuber,
                              @RequestParam String releaseDate,
                              @RequestParam String manufacturer,
                              @RequestParam String model,
                              @RequestParam String appropriation,
                              @RequestParam String elegance,
                              @RequestParam String gearType,
                              @RequestParam String fuelType,
                              @RequestParam String lpg,
                              @RequestParam String dateInstallLpg,
                              @RequestParam String insuranceFirm,
                              @RequestParam String insuranceEnd,
                              @RequestParam String sCard,
                              @RequestParam String gps,
                              @RequestParam String technicalInspectionEnd,
                              @RequestParam String gasInspectionEnd,
                              @RequestParam String comments) {
      //  carqRepository.save(Carq.builder()



      //          .build())

        return "redirect:/qrental_cars";
    }


    // @GetMapping("/car/sell")
    // public void sellCarById(@RequestParam Long id) {
    //     System.out.println("Sell Car with Id: "  + id );
    // }


}
