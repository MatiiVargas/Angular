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
public class Certificacion implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
   
    @NotNull
    @Size(min = 1, max = 150, message = "No cumple con la longitud")
    private String titulo;
 
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String fecha;
    
    @NotNull
    @Size(min = 1, max = 150, message = "No cumple con la longitud")
    private String academia;
}
