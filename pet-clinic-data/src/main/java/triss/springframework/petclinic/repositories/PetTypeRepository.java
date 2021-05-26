package triss.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import triss.springframework.petclinic.model.PetType;

/**
 * @author Beatrice V.
 * @created 26.05.2021 - 15:28
 * @project pet-clinic
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
