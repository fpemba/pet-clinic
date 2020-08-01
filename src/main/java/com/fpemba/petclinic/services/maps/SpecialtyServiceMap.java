package com.fpemba.petclinic.services.maps;

import com.fpemba.petclinic.models.Specialty;
import com.fpemba.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {
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