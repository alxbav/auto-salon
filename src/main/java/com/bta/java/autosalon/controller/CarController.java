package com.bta.java.autosalon.controller;

import com.bta.java.autosalon.model.car.Car;
import com.bta.java.autosalon.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CarController {
 //   @Autowired
   // private CarRepository carRepository;

//    @GetMapping("/qrental_cars")
//    public ModelAndView getAllCars() {
//        Map<String, Object> model = new HashMap<>();
//        List<Car> availableCars = carRepository.findAll();
    //       model.put("cars", availableCars);
    //       ModelAndView result = new ModelAndView("qrental_cars", model);
    //      return result;

// }


  //  @GetMapping("/car/sell")
  //  public void sellCarById(@RequestParam Long id) {
  //      System.out.println("Sell Car with Id: " + id);
  //  }

}
