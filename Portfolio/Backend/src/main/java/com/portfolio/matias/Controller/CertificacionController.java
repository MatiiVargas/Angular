package com.portfolio.matias.Controller;

import com.portfolio.matias.Entity.Certificacion;
import com.portfolio.matias.Interface.ICertificacionService;
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
public class CertificacionController {
    @Autowired ICertificacionService icertificacionService;
    
    @GetMapping("certificaciones/traer")
    public List<Certificacion> getCertificacion() {
        return icertificacionService.getCertificacion();
    }
    
    //Guardame esto en la base de datos
    @PostMapping("/certificaciones/crear")
    public String createCertificacion(@RequestBody Certificacion certificacion){
        icertificacionService.saveCertificacion(certificacion);
        return "La certificacion fue creada correctamente";
    }
    
    @DeleteMapping("/certificaciones/borrar/{id}")
    public String deleteCertificacion(@PathVariable Long id) {
        icertificacionService.deleteCertificacion(id);
        return "La certificacion fue eliminada correctamente";
    }
    
    //Para editar
    @PutMapping("/certificaciones/editar/{id}")
    public Certificacion editCertificacion(@PathVariable Long id, 
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("fecha") String nuevaFecha,
                               @RequestParam("academia") String nuevaAcademia) {
        Certificacion certificacion = icertificacionService.findCertificacion(id);
        
        certificacion.setTitulo(nuevoTitulo);
        certificacion.setFecha(nuevaFecha);
        certificacion.setAcademia(nuevaAcademia);
        
        icertificacionService.saveCertificacion(certificacion);
        return certificacion;
    } 
    
    @GetMapping("/certificaciones/traer/perfil")
    public Certificacion findCertificacion(){
        return icertificacionService.findCertificacion((long)1);
    }
}
