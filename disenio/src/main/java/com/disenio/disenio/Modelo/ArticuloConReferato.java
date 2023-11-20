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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ArticuloConReferato {
    
      
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String lugar;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String nombreArticulo;

    public ArticuloConReferato() {
    }

    public ArticuloConReferato(Long id, String lugar, Date fecha, String nombreArticulo, Autor autor) {
        this.id = id;
        this.lugar = lugar;
        this.fecha = fecha;
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }
    
    
    //muchos articulos pueden ser de un autor
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

}
