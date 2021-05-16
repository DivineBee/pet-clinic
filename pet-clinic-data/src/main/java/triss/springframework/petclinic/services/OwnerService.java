package triss.springframework.petclinic.services;

import triss.springframework.petclinic.model.Owner;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 13:36
 * @project pet-clinic
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
