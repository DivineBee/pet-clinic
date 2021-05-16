package triss.springframework.petclinic.services;

import triss.springframework.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 13:36
 * @project pet-clinic
 */
public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
