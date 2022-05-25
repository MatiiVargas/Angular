package com.portfolio.matias.Interface;

import com.portfolio.matias.Entity.Certificacion;
import java.util.List;


public interface ICertificacionService {
    //Traer una lista de personas
    public List<Certificacion> getCertificacion();
    
    //Guardar un objeto de tipo certificacion
    public void saveCertificacion(Certificacion certificacion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteCertificacion(Long id);
    
    //Buscar una certificacion por ID
    public Certificacion findCertificacion(Long id);
}
