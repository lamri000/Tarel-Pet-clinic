package com.tarek.tarelclinic.services;

import java.util.Set;

public interface CrudService< T,ID>{
    Set<T> findAll();
     T findById(ID id);
     T save(Object T);
     void delete(Object T);
     void deleteById(ID id);

}

