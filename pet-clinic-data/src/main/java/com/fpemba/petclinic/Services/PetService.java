package com.fpemba.petclinic.Services;

import com.fpemba.petclinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
