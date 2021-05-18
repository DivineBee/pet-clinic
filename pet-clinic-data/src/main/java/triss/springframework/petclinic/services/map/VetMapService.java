package triss.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import triss.springframework.petclinic.model.Vet;
import triss.springframework.petclinic.services.CrudService;
import triss.springframework.petclinic.services.VetService;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 17.05.2021 - 11:02
 * @project pet-clinic
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
