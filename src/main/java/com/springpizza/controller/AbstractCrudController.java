package com.springpizza.controller;


import org.springframework.web.bind.annotation.*;
import com.springpizza.service.Crud;

import java.util.List;

public abstract class AbstractCrudController<T, ID, SERVICE extends Crud<T,ID>>{

    public abstract SERVICE getService();

    @PostMapping
    public T create(@RequestBody T entity){
        return getService().create(entity);
    }

    @PutMapping
    public T update(@RequestBody T entity){
        return getService().update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id){
        getService().delete(id);
    }

    @GetMapping("/{id}")
    public T findById(@PathVariable ID id){
        return getService().findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping
    public List<T> findAll(){
        return getService().findAll();
    }



}
