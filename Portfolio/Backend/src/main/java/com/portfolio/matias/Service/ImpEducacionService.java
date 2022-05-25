package com.portfolio.matias.Service;

import com.portfolio.matias.Entity.Educacion;
import com.portfolio.matias.Interface.IEducacionService;
import com.portfolio.matias.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ImpEducacionService implements IEducacionService{
    @Autowired IEducacionRepository ieducacionRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
       ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionRepository.findById(id) .orElse(null);
        return educacion;
    }
}
