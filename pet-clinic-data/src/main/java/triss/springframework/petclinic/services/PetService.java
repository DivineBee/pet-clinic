package triss.springframework.petclinic.services;

import triss.springframework.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 13:38
 * @project pet-clinic
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
