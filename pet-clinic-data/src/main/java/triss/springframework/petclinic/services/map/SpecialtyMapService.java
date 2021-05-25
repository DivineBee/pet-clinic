package triss.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import triss.springframework.petclinic.model.Specialty;
import triss.springframework.petclinic.services.SpecialtyService;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 25.05.2021 - 20:31
 * @project pet-clinic
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}