package ee.qtakso.driverpotential.adapter.service;



import ee.qtakso.driverpotential.application.port.in.command.DriverPotentialCreateCommand;

public interface DriverPotentialService {
    void add(DriverPotentialCreateCommand driver);

}
