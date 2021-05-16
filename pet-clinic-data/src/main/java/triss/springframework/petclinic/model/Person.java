package triss.springframework.petclinic.model;

/**
 * @author Beatrice V.
 * @created 11.05.2021 - 16:29
 * @project pet-clinic
 */
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
