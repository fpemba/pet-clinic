package com.fpemba.petclinic.Services;

import com.fpemba.petclinic.Model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
