package triss.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import triss.springframework.petclinic.model.Owner;

/**
 * @author Beatrice V.
 * @created 26.05.2021 - 15:27
 * @project pet-clinic
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
