package triss.springframework.petclinic.services.map;

import triss.springframework.petclinic.model.Pet;
import triss.springframework.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 17.05.2021 - 10:59
 * @project pet-clinic
 */
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
