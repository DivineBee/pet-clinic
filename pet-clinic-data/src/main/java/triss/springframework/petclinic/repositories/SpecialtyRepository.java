package triss.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import triss.springframework.petclinic.model.Specialty;

/**
 * @author Beatrice V.
 * @created 26.05.2021 - 15:29
 * @project pet-clinic
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
