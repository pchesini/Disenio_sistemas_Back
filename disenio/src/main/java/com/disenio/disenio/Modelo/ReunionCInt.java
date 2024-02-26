/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;


@Entity
public class ReunionCInt extends ReunionCientifica{
   
    @Basic
    private String pais;

    public ReunionCInt() {
    }

    public ReunionCInt(String pais) {
        this.pais = pais;
    }

    public ReunionCInt(String pais, Long id, LocalDateTime fechaInicio, String expositor, String tituloTrabajo, Autor autor) {
        super(id, fechaInicio, expositor, tituloTrabajo, autor);
        this.pais = pais;
    }
    @Override
    public boolean isEliminado() {
        return eliminado;
    }
    @Override
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }



    

 

 
   
}
