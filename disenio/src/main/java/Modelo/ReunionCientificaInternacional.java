/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ReunionCientificaInternacional extends ReunionCientifica{
    
    @Basic
    private String pais;

    public ReunionCientificaInternacional() {
    }
    
    

    public ReunionCientificaInternacional(String pais) {
        this.pais = pais;
    }

    public ReunionCientificaInternacional(String pais, Long id, String expositor, Date fechaInicio, String nombreReunion, String nombreTrabajo, Autor autor) {
        super(id, expositor, fechaInicio, nombreReunion, nombreTrabajo, autor);
        this.pais = pais;
    }
}
