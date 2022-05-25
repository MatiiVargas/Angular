package com.portfolio.matias.Interface;

import com.portfolio.matias.Entity.Idioma;
import java.util.List;


public interface IIdiomaService {
    //Traer una lista de idioma
    public List<Idioma> getIdioma();
    
    //Guardar un objeto de tipo idioma
    public void saveIdioma(Idioma idioma);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteIdioma(Long id);
    
    //Buscar una idioma por ID
    public Idioma findIdioma(Long id);
}
