package ee.qtakso.driverpotential.application.port.in.usecase;

import ee.qtakso.driverpotential.application.port.in.command.DriverPotentialCreateCommand;

public interface DriverPotentialUpdateUseCase {
    void uprate(DriverPotentialCreateCommand driver);
}
