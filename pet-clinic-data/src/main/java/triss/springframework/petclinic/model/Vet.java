package triss.springframework.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Beatrice V.
 * @created 11.05.2021 - 16:30
 * @project pet-clinic
 */
public class Vet extends Person{
    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
