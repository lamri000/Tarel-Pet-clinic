package com.tarek.tarelclinic.services;

import com.tarek.tarelclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName();
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAl();
}

