package ee.qtakso.driverpotential.adapter.in.web.controller;


import ee.qtakso.driverpotential.application.port.in.command.DriverPotentialCreateCommand;
import ee.qtakso.driverpotential.application.port.in.usecase.DriverPotentialRegistrationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor

@Controller
@RequestMapping("/driver-potential")
public class DriverPotentialController {

    private final DriverPotentialRegistrationUseCase driverPotentialRegistrationUseCase;

    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }
    @PostMapping("/register")
    public String registerDriverPotential(
            final DriverPotentialCreateCommand createCommand) {

        driverPotentialRegistrationUseCase.register(createCommand);
        return "redirect:/home";
    }

}
