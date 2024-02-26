
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;


@Entity
public class ReunionCNac extends ReunionCientifica {
   
    
     @Basic
    private String ciudad;

    public ReunionCNac() {
        // Constructor sin argumentos necesario para JPA
    }

    public ReunionCNac(String ciudad) {
        this.ciudad = ciudad;
    }

    public ReunionCNac(String ciudad, Long id, LocalDateTime fechaInicio, String expositor, String tituloTrabajo, Autor autor) {
        super(id, fechaInicio, expositor, tituloTrabajo, autor);
        this.ciudad = ciudad;
    }

 
   
 
       
    @Override
    public boolean isEliminado() {
        return eliminado;
    }
    @Override
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

 

    
}
  