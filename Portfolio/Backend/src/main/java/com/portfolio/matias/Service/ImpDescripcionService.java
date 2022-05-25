package com.portfolio.matias.Service;

import com.portfolio.matias.Entity.Descripcion;
import com.portfolio.matias.Interface.IDescripcionService;
import com.portfolio.matias.Repository.IDescripcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class ImpDescripcionService implements IDescripcionService{
     @Autowired IDescripcionRepository idescripcionRepository;

    @Override
    public List<Descripcion> getDescripcion() {
        List<Descripcion> descripcion = idescripcionRepository.findAll();
        return descripcion;
    }

    @Override
    public void saveDescripcion(Descripcion descripcion) {
        idescripcionRepository.save(descripcion);
    }

    @Override
    public void deleteDescripcion(Long id) {
       idescripcionRepository.deleteById(id);
    }

    @Override
    public Descripcion findDescripcion(Long id) {
        Descripcion descripcion = idescripcionRepository.findById(id) .orElse(null);
        return descripcion;
    }
}
