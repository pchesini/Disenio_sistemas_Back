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
public class ReunionCientificaNacional extends ReunionCientifica{
    @Basic
    private String ciudad;

    public ReunionCientificaNacional() {
    }

    public ReunionCientificaNacional(String ciudad) {
        this.ciudad = ciudad;
    }

    public ReunionCientificaNacional(String ciudad, Long id, String expositor, Date fechaInicio, String nombreReunion, String nombreTrabajo, Autor autor) {
        super(id, expositor, fechaInicio, nombreReunion, nombreTrabajo, autor);
        this.ciudad = ciudad;
    }
}
