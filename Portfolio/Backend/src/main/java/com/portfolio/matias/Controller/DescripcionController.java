package com.portfolio.matias.Controller;

import com.portfolio.matias.Entity.Descripcion;
import com.portfolio.matias.Interface.IDescripcionService;
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
public class DescripcionController {
    @Autowired IDescripcionService idescripcionService;
    
    @GetMapping("descripciones/traer")
    public List<Descripcion> getDescripcion() {
        return idescripcionService.getDescripcion();
    }
    
    //Guardame esto en la base de datos
    @PostMapping("/descripciones/crear")
    public String createDescripcion(@RequestBody Descripcion descripcion){
        idescripcionService.saveDescripcion(descripcion);
        return "La descripcion fue creada correctamente";
    }
    
    @DeleteMapping("/descripciones/borrar/{id}")
    public String deleteDescripcion(@PathVariable Long id) {
        idescripcionService.deleteDescripcion(id);
        return "La descripcion fue eliminada correctamente";
    }
    
    //Para editar
    @PutMapping("/descripciones/editar/{id}")
    public Descripcion editDescripcion(@PathVariable Long id, 
                               @RequestParam("descripcion") String nuevaDescripcion){
        Descripcion descripcion = idescripcionService.findDescripcion(id);
        
        descripcion.setDescripcion(nuevaDescripcion);
        
        idescripcionService.saveDescripcion(descripcion);
        return descripcion;
    } 
    
    @GetMapping("/descripciones/traer/perfil")
    public Descripcion findPersona(){
        return idescripcionService.findDescripcion((long)1);
    }
}
