package com.fpemba.petclinic.repositories;

import com.fpemba.petclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
