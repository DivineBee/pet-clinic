package triss.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import triss.springframework.petclinic.model.Visit;

/**
 * @author Beatrice V.
 * @created 26.05.2021 - 15:30
 * @project pet-clinic
 */
public interface VisistRepository extends CrudRepository<Visit, Long> {
}
