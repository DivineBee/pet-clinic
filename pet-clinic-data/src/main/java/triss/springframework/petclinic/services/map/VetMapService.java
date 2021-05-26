package triss.springframework.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import triss.springframework.petclinic.model.Specialty;
import triss.springframework.petclinic.model.Vet;
import triss.springframework.petclinic.services.SpecialtyService;
import triss.springframework.petclinic.services.VetService;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 17.05.2021 - 11:02
 * @project pet-clinic
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
