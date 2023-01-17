package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.driver.DriverPotential;
import com.bta.java.autosalon.repository.DriverPotentialRepository;
import ee.qtakso.api.service.DriverPotentialService;
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
public class DriverPotentialController {

    @Autowired
    private DriverPotentialRepository driverPotentialRepository;

    @Autowired
    private DriverPotentialService driverPotentialService;

    @GetMapping("/home")
    public ModelAndView getAllDriverPotential() {
        Map<String, Object> model = new HashMap<>();
        List<DriverPotential> availableDriverPotential = driverPotentialRepository.findAll();
        model.put("driverpotentials", availableDriverPotential);
        ModelAndView result = new ModelAndView("/home/home", model);
        return result;
    }

    @GetMapping("/home/add")
    public ModelAndView addDriverPotential() {
        Map<String, Object> model = new HashMap<>();
        List<DriverPotential> availableDriverPotential = driverPotentialRepository.findAll();
        model.put("driverpotentials", availableDriverPotential);
        ModelAndView result = new ModelAndView("/home/home-add", model);
        return result;
    }

    @PostMapping("/home/add")
    public String addPostDriverPotential( DriverPotentialRequestDto newDriver) {
        driverPotentialService.add(newDriver);
        return "redirect:/home";
    }


}
