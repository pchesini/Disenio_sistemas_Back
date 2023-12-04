/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
class Publicacion {
     @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String editorial;
    private int isbn;

    public Publicacion() {
    }

    public Publicacion(Long id, String editorial, int isbn, Autor autor) {
        this.id = id;
        this.editorial = editorial;
        this.isbn = isbn;
        this.autor = autor;
    }
    
    
    @OneToOne
    @JoinColumn (name="id_autor")
    private Autor autor;
}
