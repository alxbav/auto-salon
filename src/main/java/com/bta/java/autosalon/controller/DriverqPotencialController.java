package com.bta.java.autosalon.controller;

import com.bta.java.autosalon.model.driverq.DriverqPotencial;
import com.bta.java.autosalon.repository.DriverqPotencialRepository;
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
public class DriverqPotencialController {

    @Autowired
    private DriverqPotencialRepository driverqPotencialRepository;

    @GetMapping("/home")
    public ModelAndView getAllDriverqpotenc() {
        Map<String, Object> model = new HashMap<>();
        List<DriverqPotencial> availableDriverqPotencial = driverqPotencialRepository.findAll();
        model.put("driverqpotencs", availableDriverqPotencial);
        ModelAndView result = new ModelAndView("/home/home", model);
        return result;
    }

    @GetMapping("/home/add")
    public ModelAndView addDriverqpotenc() {
        Map<String, Object> model = new HashMap<>();
        List<DriverqPotencial> availableDriverqPotencial = driverqPotencialRepository.findAll();
        model.put("driverqpotencs", availableDriverqPotencial);
        ModelAndView result = new ModelAndView("/home/home-add", model);
        return result;
    }

    @PostMapping("/home/add")
    public String addPostDriverqpotenc(@RequestParam String firstName, @RequestParam String lastName,
                                       @RequestParam String phone, @RequestParam String active1,
                                       @RequestParam String comments) {
        driverqPotencialRepository.save(DriverqPotencial.builder()
                .firstName(firstName)
                .lastName(lastName)
                .phone(phone)
                .active1(active1)
                .comments(comments)
                .build());

        return "redirect:/home";
    }


}
