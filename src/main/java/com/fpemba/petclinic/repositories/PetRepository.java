package com.fpemba.petclinic.repositories;

import com.fpemba.petclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
