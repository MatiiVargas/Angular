package com.portfolio.matias.Controller;

import com.portfolio.matias.Entity.Proyectos;
import com.portfolio.matias.Interface.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping("proyectos/traer")
    public List<Proyectos> getProyectos() {
        return iproyectosService.getProyectos();
    }
    
    //Guardame esto en la base de datos
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return "El proyecto fue creada correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id) {
        iproyectosService.deleteProyectos(id);
        return "El proyecto fue eliminada correctamente";
    }
    
    //Para editar
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id, 
                               @RequestParam("rotulo") String nuevoRotulo,
                               @RequestParam("contenido") String nuevoContenido,
                               @RequestParam("picture") String nuevaPicture) {
        Proyectos proyectos = iproyectosService.findProyectos(id);
        
        proyectos.setRotulo(nuevoRotulo);
        proyectos.setContenido(nuevoContenido);
        proyectos.setPicture(nuevaPicture);
        
        iproyectosService.saveProyectos(proyectos);
        return proyectos;
    } 
}
