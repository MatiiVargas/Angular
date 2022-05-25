package com.portfolio.matias.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idioma implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String denominar;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud")
    private String escuela;
        
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String periodo;
}
