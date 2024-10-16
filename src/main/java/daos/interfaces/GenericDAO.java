package daos.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GenericDAO<T, ID> {

    boolean save(T entity);
    boolean update(T entity);
    boolean delete(T entity);
    Optional<T> find(ID id);
    List<T> getAll();
}
