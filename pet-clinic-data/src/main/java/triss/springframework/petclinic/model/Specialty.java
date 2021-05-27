package triss.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Beatrice V.
 * @created 23.05.2021 - 17:24
 * @project pet-clinic
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity{

    @Column(name = "description")
    private String description;
}
