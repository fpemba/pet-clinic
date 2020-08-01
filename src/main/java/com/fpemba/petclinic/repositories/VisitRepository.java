package com.fpemba.petclinic.repositories;

import com.fpemba.petclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
