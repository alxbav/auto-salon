package ee.qtakso.driverpotential.application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverPotentialApplicationConfig {
    @Bean
    public DriverPotentialService getDriverPotentialService(){
        return new DriverPotentialService();
    }
}
