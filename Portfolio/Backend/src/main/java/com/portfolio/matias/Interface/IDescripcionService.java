package com.portfolio.matias.Interface;

import com.portfolio.matias.Entity.Descripcion;
import java.util.List;


public interface IDescripcionService {
     //Traer una lista de personas
    public List<Descripcion> getDescripcion();
    
    //Guardar un objeto de tipo descripcion
    public void saveDescripcion(Descripcion descripcion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteDescripcion(Long id);
    
    //Buscar una descripcion por ID
    public Descripcion findDescripcion(Long id);
}
