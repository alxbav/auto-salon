package ee.qtakso.driverpotential.adapter.out.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataDriverPotentialRepository
        extends JpaRepository<DriverPotentialJpaEntity, Long> {
}
