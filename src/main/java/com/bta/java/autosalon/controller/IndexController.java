package com.bta.java.autosalon.controller;

import com.bta.java.autosalon.model.driverq.DriverqPotencial;
import com.bta.java.autosalon.repository.DriverqPotencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

   // @Autowired
    public DriverqPotencialRepository driverqPotencialRepository;

    @GetMapping("/")
    public String getRootView() {
        return "index";
    }

 /*   @GetMapping("/index.html")
    public String getIndexView() {

        return "index";
    }
*/
    @GetMapping("/index.ftl")
    public ModelAndView homeMain() {
        Map<String, Object> model = new HashMap<>();

        List<DriverqPotencial> availableDriverqPotencial = driverqPotencialRepository.findAll();
        model.put("driverqpotencs", availableDriverqPotencial);
        ModelAndView result = new ModelAndView("/home", model);
        return result;
    }



}




