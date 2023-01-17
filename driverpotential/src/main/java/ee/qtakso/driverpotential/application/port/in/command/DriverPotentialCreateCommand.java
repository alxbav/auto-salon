package ee.qtakso.driverpotential.application.port.in.command;


public record DriverPotentialCreateCommand(
        String firstName,
        String lastName,
        String phone,
        String active,
        String comment) {
}