package ee.qtakso.driverpotential.application.service;

import ee.qtakso.driverpotential.application.port.in.command.DriverPotentialCreateCommand;
import ee.qtakso.driverpotential.application.port.in.usecase.DriverPotentialRegistrationUseCase;
import ee.qtakso.driverpotential.application.port.in.usecase.DriverPotentialUpdateUseCase;

 class DriverPotentialService implements
        DriverPotentialRegistrationUseCase,
        DriverPotentialUpdateUseCase {
    @Override
    public void register(DriverPotentialCreateCommand command) {
       System.out.println("User Registered");
    }

    @Override
    public void uprate(DriverPotentialCreateCommand command) {
       System.out.println("User Updated");
    }
}
