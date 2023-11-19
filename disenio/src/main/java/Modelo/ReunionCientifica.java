/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
class ReunionCientifica {
     
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String expositor;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    private String nombreReunion;
    private String nombreTrabajo;

    public ReunionCientifica() {
    }

    public ReunionCientifica(Long id, String expositor, Date fechaInicio, String nombreReunion, String nombreTrabajo, Autor autor) {
        this.id = id;
        this.expositor = expositor;
        this.fechaInicio = fechaInicio;
        this.nombreReunion = nombreReunion;
        this.nombreTrabajo = nombreTrabajo;
        this.autor = autor;
    }
    
    
    @ManyToOne
    @JoinColumn (name="id_autor")
    private Autor autor;
   
}
