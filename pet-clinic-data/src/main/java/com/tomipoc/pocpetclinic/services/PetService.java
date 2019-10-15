package com.tomipoc.pocpetclinic.services;

import com.tomipoc.pocpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
