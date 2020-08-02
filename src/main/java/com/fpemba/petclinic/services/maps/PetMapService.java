package com.fpemba.petclinic.services.maps;

import com.fpemba.petclinic.models.Pet;
import com.fpemba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","maps"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteByID(Long id) {

        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
