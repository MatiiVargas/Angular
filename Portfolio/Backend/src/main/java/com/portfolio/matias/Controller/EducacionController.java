package com.portfolio.matias.Controller;

import com.portfolio.matias.Entity.Educacion;
import com.portfolio.matias.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }
    
    //Guardame esto en la base de datos
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        ieducacionService.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    //Para editar
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id, 
                               @RequestParam("carrera") String nuevaCarrera,
                               @RequestParam("instituto") String nuevoInstituto,
                               @RequestParam("anio") String nuevoAnio) {
        Educacion educacion = ieducacionService.findEducacion(id);
        
        educacion.setCarrera(nuevaCarrera);
        educacion.setInstituto(nuevoInstituto);
        educacion.setAnio(nuevoAnio);
        
        ieducacionService.saveEducacion(educacion);
        return educacion;
    } 
    
    @GetMapping("/educacion/traer/perfil")
    public Educacion findPersona(){
        return ieducacionService.findEducacion((long)1);
    }
}
