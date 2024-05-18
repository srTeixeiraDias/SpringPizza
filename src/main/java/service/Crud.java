package service;


import java.util.List;
import java.util.Optional;

public interface Crud<T, ID> {
    
    T create(T entity);
    Optional<T> findById(ID id);
    T update(T entity);
    void delete(ID id);
    List<T> findAll();
}
