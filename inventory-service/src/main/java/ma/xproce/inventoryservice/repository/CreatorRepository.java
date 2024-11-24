package ma.xproce.inventoryservice.repository;

import ma.xproce.inventoryservice.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator,Long> {
}
