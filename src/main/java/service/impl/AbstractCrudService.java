package service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import service.Crud;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCrudService<T, ID, REPO extends JpaRepository<T,ID>> implements Crud<T, ID> {

    public abstract REPO getRepository();

    @Override
    public T create (T entity){
        return getRepository().save(entity);
    }

    @Override
    public T update (T entity){
        return getRepository().save(entity);
    }

    @Override
    public void delete(ID id){
        getRepository().deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id){
        return getRepository().findById(id);
    }

    @Override
    public List<T> findAll(){
        return getRepository().findAll();
    }
}
