/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;



@Entity
public class ReunionCInt extends ReunionCientifica{
   
    @Basic
    private String pais;

    public ReunionCInt() {
    }

    public ReunionCInt(String pais) {
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

   
}
