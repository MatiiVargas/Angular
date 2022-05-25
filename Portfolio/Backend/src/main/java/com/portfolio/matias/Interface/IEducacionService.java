package com.portfolio.matias.Interface;

import com.portfolio.matias.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
     //Traer una lista de educacion
    public List<Educacion> getEducacion();
    
    //Guardar un objeto de tipo educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteEducacion(Long id);
    
    //Buscar una educacion por ID
    public Educacion findEducacion(Long id);
}
