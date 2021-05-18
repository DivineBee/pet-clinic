package triss.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import triss.springframework.petclinic.model.Owner;
import triss.springframework.petclinic.services.OwnerService;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 17.05.2021 - 10:54
 * @project pet-clinic
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
