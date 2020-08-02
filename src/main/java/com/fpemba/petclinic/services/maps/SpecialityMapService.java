package com.fpemba.petclinic.services.maps;

import com.fpemba.petclinic.models.Specialty;
import com.fpemba.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","maps"})
public class SpecialityMapService extends AbstractMapService<Specialty,Long> implements SpecialityService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {

        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {

        super.deleteById(id);
    }
}
