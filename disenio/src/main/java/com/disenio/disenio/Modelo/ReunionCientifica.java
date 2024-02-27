/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class ReunionCientifica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected LocalDate fechaInicio;
    protected String expositor;
    protected String tituloTrabajo;
    protected boolean eliminado= false;
    protected String autor; 

    public ReunionCientifica() {
    }

    public ReunionCientifica(Long id, LocalDate fechaInicio, String expositor, String tituloTrabajo, String autor) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.expositor = expositor;
        this.tituloTrabajo = tituloTrabajo;
        this.autor = autor;
    }

  

 /*
     @ManyToOne
    @JoinColumn (name="id_autor")
    private Autor autor;
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

  
     

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getExpositor() {
        return expositor;
    }

    public void setExpositor(String expositor) {
        this.expositor = expositor;
    }

    public String getTituloTrabajo() {
        return tituloTrabajo;
    }

    public void setTituloTrabajo(String tituloTrabajo) {
        this.tituloTrabajo = tituloTrabajo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
  

}
