package triss.springframework.petclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import triss.springframework.petclinic.model.Visit;
import triss.springframework.petclinic.repositories.VisistRepository;
import triss.springframework.petclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Beatrice V.
 * @created 26.05.2021 - 16:39
 * @project pet-clinic
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisistRepository visistRepository;

    public VisitSDJpaService(VisistRepository visistRepository) {
        this.visistRepository = visistRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visistRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visistRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visistRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visistRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visistRepository.deleteById(aLong);
    }
}
