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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Data
public class Marca {
  @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String color;
    private String logotipo;
    private String nombreMarca;
    private String slogan;
    private String sonidos;
    
    @OneToOne
    @JoinColumn (name="id_RegistroPropiedadIndustrial")
    private RegistroPropiedadIndustrial registropropiedadIndustrial;

    @OneToOne
    @JoinColumn (name="id_RegistroPropiedadIntelectual")
    private RegistroPropiedadIntelectual registropropiedadIntelectual;
     
}
