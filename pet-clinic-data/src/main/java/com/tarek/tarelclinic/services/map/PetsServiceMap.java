package com.tarek.tarelclinic.services.map;

import com.tarek.tarelclinic.model.Pet;
import com.tarek.tarelclinic.services.CrudService;

import java.util.Set;

public class PetsServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById( id );
    }

    @Override
    public Pet save(Pet object ) {
        return super.save(object.getId(),object) ;
    }

    @Override
    public void delete(Pet object) {
        super.delete(object );
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById( id );
    }
}
