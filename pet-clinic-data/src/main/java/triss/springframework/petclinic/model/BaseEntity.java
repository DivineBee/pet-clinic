package triss.springframework.petclinic.model;

import java.io.Serializable;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 13:44
 * @project pet-clinic
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
