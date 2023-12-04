/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Libro extends Publicacion {
    
     @Basic
    private String nombreLibro;

    public Libro() {
    }

    public Libro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Libro(String nombreLibro, Long id, String editorial, int isbn, Autor autor) {
        super(id, editorial, isbn, autor);
        this.nombreLibro = nombreLibro;
    }
    
}
