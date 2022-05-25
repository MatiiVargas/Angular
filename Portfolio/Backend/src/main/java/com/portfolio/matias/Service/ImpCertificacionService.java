package com.portfolio.matias.Service;

import com.portfolio.matias.Entity.Certificacion;
import com.portfolio.matias.Interface.ICertificacionService;
import com.portfolio.matias.Repository.ICertificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class ImpCertificacionService implements ICertificacionService{
    @Autowired ICertificacionRepository icertificacionRepository;

    @Override
    public List<Certificacion> getCertificacion() {
        List<Certificacion> certificacion = icertificacionRepository.findAll();
        return certificacion;
    }

    @Override
    public void saveCertificacion(Certificacion certificacion) {
        icertificacionRepository.save(certificacion);
    }

    @Override
    public void deleteCertificacion(Long id) {
       icertificacionRepository.deleteById(id);
    }

    @Override
    public Certificacion findCertificacion(Long id) {
        Certificacion certificacion = icertificacionRepository.findById(id) .orElse(null);
        return certificacion;
    }
}
