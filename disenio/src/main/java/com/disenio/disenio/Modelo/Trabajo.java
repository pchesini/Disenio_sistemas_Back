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
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trabajo {
     @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String editorial;
    private String issn;
    private String nombreDeRevista;
    private String pais;
    private String tituloDeTrabajo;

    public Trabajo() {
    }

    public Trabajo(Long id, String editorial, String issn, String nombreDeRevista, String pais, String tituloDeTrabajo, Autor autor) {
        this.id = id;
        this.editorial = editorial;
        this.issn = issn;
        this.nombreDeRevista = nombreDeRevista;
        this.pais = pais;
        this.tituloDeTrabajo = tituloDeTrabajo;
        this.autor = autor;
    }
    
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
    
}
