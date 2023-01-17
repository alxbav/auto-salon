package ee.qtakso.driverpotential.application.port.in.usecase;

import ee.qtakso.driverpotential.application.port.in.command.DriverPotentialCreateCommand;

public interface DriverPotentialRegistrationUseCase {
    void register(DriverPotentialCreateCommand driver);
}
