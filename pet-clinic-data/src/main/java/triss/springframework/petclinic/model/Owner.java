package triss.springframework.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Beatrice V.
 * @created 11.05.2021 - 16:30
 * @project pet-clinic
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Builder
    public Owner(Long id, String firstName, String lastName, Set<Pet> pets, String city, String telephone, String address) {
        super(id, firstName, lastName);
        this.pets = pets;
        this.city = city;
        this.telephone = telephone;
        this.address = address;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "address")
    private String address;
}
