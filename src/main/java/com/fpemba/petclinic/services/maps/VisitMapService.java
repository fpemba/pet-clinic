package com.fpemba.petclinic.services.maps;

import com.fpemba.petclinic.models.Visit;
import com.fpemba.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long >implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null ||
                visit.getPet().getId() == null ||visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {

        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {

        super.deleteById(id);
    }
}
