package com.tomipoc.pocpetclinic.services;

import com.tomipoc.pocpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
