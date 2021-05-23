package triss.springframework.petclinic.model;

/**
 * @author Beatrice V.
 * @created 23.05.2021 - 17:24
 * @project pet-clinic
 */
public class Specialty extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
