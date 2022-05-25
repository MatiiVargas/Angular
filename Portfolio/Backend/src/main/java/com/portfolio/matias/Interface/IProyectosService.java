package com.portfolio.matias.Interface;

import com.portfolio.matias.Entity.Proyectos;
import java.util.List;


public interface IProyectosService {
    //Traer una lista de proyectos
    public List<Proyectos> getProyectos();
    
    //Guardar un objeto de tipo proyectos
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteProyectos(Long id);
    
    //Buscar una proyectos por ID
    public Proyectos findProyectos(Long id);    
}
