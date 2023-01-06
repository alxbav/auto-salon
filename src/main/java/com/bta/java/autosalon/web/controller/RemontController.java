package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.repository.RemontRepository;
//import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RemontController {
  // @Autowired

    private RemontRepository remontRepository;

    @GetMapping("/remont")
    public ModelAndView getAllCars() {
        Map<String, Object> model = new HashMap<>();
       /* List<Car> availableCars = remontRepository.findAll();
        model.put("cars", availableCars);*/
        ModelAndView result = new ModelAndView("remont/remont", model);
        return result;


    }
}
