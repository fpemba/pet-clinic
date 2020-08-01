package com.fpemba.petclinic.repositories;

import com.fpemba.petclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
