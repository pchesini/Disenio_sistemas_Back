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
import jakarta.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RegistroPropiedadIndustrial {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombrePropiedad;
    private String tipoLicencia; //Es un enum en el diagrama de clases
    private String titularPropiedad;

    public RegistroPropiedadIndustrial() {
    }

    public RegistroPropiedadIndustrial(Long id, String nombrePropiedad, String tipoLicencia, String titularPropiedad, Marca marca) {
        this.id = id;
        this.nombrePropiedad = nombrePropiedad;
        this.tipoLicencia = tipoLicencia;
        this.titularPropiedad = titularPropiedad;
        this.marca = marca;
    }
    
    
    
    @OneToOne
    @JoinColumn (name="id_marca")
    private Marca marca;
}
