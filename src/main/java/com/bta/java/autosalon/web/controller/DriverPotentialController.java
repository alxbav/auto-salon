package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.driver.DriverPotential;
import com.bta.java.autosalon.repository.DriverPotentialRepository;
import com.bta.java.autosalon.service.DriverPotentialService;
import com.bta.java.autosalon.web.dto.DriverPotentialRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class DriverPotentialController {

    @Autowired
    private DriverPotentialRepository driverPotentialRepository;

    @Autowired
    private DriverPotentialService driverPotentialService;

    public DriverPotentialController(DriverPotentialRepository driverPotentialRepository) {
        this.driverPotentialRepository = driverPotentialRepository;
    }

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("driverPotentials", driverPotentialRepository.findAll());
        return "/home/home.html";
    }

    @GetMapping("/{driverPotentialId}")
    public String findById(@PathVariable long driverPotentialId, Model model) {
        model.addAttribute("driverPotentials", driverPotentialRepository.findById(driverPotentialId));
        return "/home/home.html";
    }
    @PostMapping()
    public String save(DriverPotential driverPotential) {
        driverPotentialRepository.save(driverPotential);
        return "redirect:/home";
    }

    @DeleteMapping("/{driverPotentialId}")
    public String findById(@PathVariable long driverPotentialId) {
        driverPotentialRepository.deleteById(driverPotentialId);
        return "redirect:/home";
    }


}

 /*   @GetMapping("/home")
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
*/