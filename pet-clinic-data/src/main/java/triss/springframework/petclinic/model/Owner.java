package triss.springframework.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Beatrice V.
 * @created 11.05.2021 - 16:30
 * @project pet-clinic
 */
public class Owner extends Person{

    private Set<Pet> pets = new HashSet<>();
    private String city;
    private String telephone;
    private String address;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
