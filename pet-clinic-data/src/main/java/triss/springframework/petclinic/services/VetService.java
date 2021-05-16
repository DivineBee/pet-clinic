package triss.springframework.petclinic.services;

import triss.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 13:39
 * @project pet-clinic
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
