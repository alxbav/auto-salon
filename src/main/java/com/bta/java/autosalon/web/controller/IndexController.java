package com.bta.java.autosalon.web.controller;

import com.bta.java.autosalon.model.driver.DriverPotential;
import com.bta.java.autosalon.repository.DriverPotentialRepository;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(" /home")
public class IndexController {

   // @Autowired
    public DriverPotentialRepository driverPotentialRepository;

    @GetMapping("/")
    public String getRootView() {
        return "index";
    }

 /*   @GetMapping("/index.html")
    public String getIndexView() {

        return "index";
    }
*/
    @GetMapping("/index.html")
    public ModelAndView homeMain() {
    //    Map<String, Object> model = new HashMap<>();

     //   List<DriverPotential> availableDriverPotencial = driverPotentialRepository.findAll();
     //   model.put("driverqpotencs", availableDriverPotencial);
     //   ModelAndView result = new ModelAndView("/home", model);
     //   return result;
        return null;
    }



}




