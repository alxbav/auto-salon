package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.driver.Driver;
import com.bta.java.autosalon.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigInteger;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DriverqController {
    @Autowired
    private DriverRepository driverRepository;

    @GetMapping("/driverq")
    public ModelAndView getAllDriverq() {
        Map<String, Object> model = new HashMap<>();
        List<Driver> availableDriver = driverRepository.findAll();
        model.put("driverqs", availableDriver);
        ModelAndView result = new ModelAndView("/driverq/driverq", model);
        return result;
    }

    @GetMapping("/driverq/driverq-add")
    public ModelAndView addDriverq() {
        Map<String, Object> model = new HashMap<>();
        List<Driver> availableDriver = driverRepository.findAll();
        model.put("driverqs", availableDriver);
        ModelAndView result = new ModelAndView("/driverq/driverq-add", model);
        return result;
    }

    @PostMapping("/driverq/driverq-add")
    public String addPostDriverq(
            @RequestParam Boolean active,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam BigInteger isikukood,
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String iban1,
            @RequestParam String iban2,
            @RequestParam String iban3,
            @RequestParam String driverLicenseNumber,
            @RequestParam Date driverLicenseExp,
            @RequestParam String taxiLicense,
            @RequestParam String address,
            @RequestParam String comments) {
        driverRepository.save(Driver.builder()
                .active(active)
                .firstName(firstName)
                .lastName(lastName)
                .isikukood(isikukood)
                .phone(phone)
                .email(email)
                .iban1(iban1)
                .iban2(iban2)
                .iban3(iban3)
                .driverLicenseNumber(driverLicenseNumber)
                .driverLicenseExp(driverLicenseExp)
                .taxiLicense(taxiLicense)
                .address(address)
                .comments(comments)
                .build());

        return "redirect:/driverq";
    }


}
