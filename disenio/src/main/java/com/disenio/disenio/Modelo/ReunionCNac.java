
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;


@Entity
public class ReunionCNac extends ReunionCientifica {
  
     @Basic
    private String ciudad;

     
     
    public ReunionCNac() {
       
    }

    public ReunionCNac(String ciudad) {
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
  