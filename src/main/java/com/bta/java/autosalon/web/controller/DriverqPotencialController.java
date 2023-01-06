package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.driverq.DriverPotencial;
import com.bta.java.autosalon.repository.DriverqPotencialRepository;
import com.bta.java.autosalon.service.DriverPotentialService;
import com.bta.java.autosalon.web.dto.DriverPotentialRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DriverqPotencialController {

    @Autowired
    private DriverqPotencialRepository driverqPotencialRepository;

    @Autowired
    private DriverPotentialService driverPotentialService;

    @GetMapping("/home")
    public ModelAndView getAllDriverqpotenc() {
        Map<String, Object> model = new HashMap<>();
        List<DriverPotencial> availableDriverPotencial = driverqPotencialRepository.findAll();
        model.put("driverqpotencs", availableDriverPotencial);
        ModelAndView result = new ModelAndView("/home/home", model);
        return result;
    }

    @GetMapping("/home/add")
    public ModelAndView addDriverqpotenc() {
        Map<String, Object> model = new HashMap<>();
        List<DriverPotencial> availableDriverPotencial = driverqPotencialRepository.findAll();
        model.put("driverqpotencs", availableDriverPotencial);
        ModelAndView result = new ModelAndView("/home/home-add", model);
        return result;
    }

    @PostMapping("/home/add")
    public String addPostDriverqpotenc(@RequestBody DriverPotentialRequestDto newDriver) {
        driverPotentialService.add(newDriver);
        return "redirect:/home";
    }


}
