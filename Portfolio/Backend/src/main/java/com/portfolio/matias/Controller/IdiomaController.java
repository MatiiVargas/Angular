package com.portfolio.matias.Controller;

import com.portfolio.matias.Entity.Idioma;
import com.portfolio.matias.Interface.IIdiomaService;
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
public class IdiomaController {
    @Autowired IIdiomaService iidiomaService;
    
    @GetMapping("idioma/traer")
    public List<Idioma> getIdioma() {
        return iidiomaService.getIdioma();
    }
    
    //Guardame esto en la base de datos
    @PostMapping("/idioma/crear")
    public String createIdioma(@RequestBody Idioma idioma){
        iidiomaService.saveIdioma(idioma);
        return "El idioma fue creada correctamente";
    }
    
    @DeleteMapping("/idioma/borrar/{id}")
    public String deleteIdioma(@PathVariable Long id) {
        iidiomaService.deleteIdioma(id);
        return "El idioma fue eliminada correctamente";
    }
    
    //Para editar
    @PutMapping("/idioma/editar/{id}")
    public Idioma editIdioma(@PathVariable Long id, 
                               @RequestParam("denominar") String nuevoDenominar,
                               @RequestParam("escuela") String nuevaEscuela,
                               @RequestParam("periodo") String nuevoPeriodo) {
        Idioma idioma = iidiomaService.findIdioma(id);
        
        idioma.setDenominar(nuevoDenominar);
        idioma.setEscuela(nuevaEscuela);
        idioma.setPeriodo(nuevoPeriodo);
        
        iidiomaService.saveIdioma(idioma);
        return idioma;
    }     
    
    @GetMapping("/idioma/traer/perfil")
    public Idioma findIdioma(){
        return iidiomaService.findIdioma((long)1);
    }
}