package triss.springframework.petclinic.services;

import java.util.Set;

/**
 * @author Beatrice V.
 * @created 16.05.2021 - 20:56
 * @project pet-clinic
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
