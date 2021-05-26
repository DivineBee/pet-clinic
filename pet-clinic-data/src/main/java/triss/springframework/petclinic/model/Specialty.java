package triss.springframework.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Beatrice V.
 * @created 23.05.2021 - 17:24
 * @project pet-clinic
 */
@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity{

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
