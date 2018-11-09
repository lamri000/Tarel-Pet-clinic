package com.tarek.tarelclinic.services;

import com.tarek.tarelclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}

