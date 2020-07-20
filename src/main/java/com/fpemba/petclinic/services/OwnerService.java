package com.fpemba.petclinic.services;


import com.fpemba.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
