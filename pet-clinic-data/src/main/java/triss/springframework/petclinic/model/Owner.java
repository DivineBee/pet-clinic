package triss.springframework.petclinic.model;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 11.05.2021 - 16:30
 * @project pet-clinic
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
