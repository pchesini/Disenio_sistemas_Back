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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

public class RegistroPropiedadIntelectual {
      @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String diseños;
    private String modelosDeUtilidad;
    private String modelosIndustriales;
    private String nombrePropiedad;
    private String patenteDeInvencion;
    private String titularPropiedad;

    public RegistroPropiedadIntelectual() {
    }

    public RegistroPropiedadIntelectual(Long id, String diseños, String modelosDeUtilidad, String modelosIndustriales, String nombrePropiedad, String patenteDeInvencion, String titularPropiedad, Marca marca) {
        this.id = id;
        this.diseños = diseños;
        this.modelosDeUtilidad = modelosDeUtilidad;
        this.modelosIndustriales = modelosIndustriales;
        this.nombrePropiedad = nombrePropiedad;
        this.patenteDeInvencion = patenteDeInvencion;
        this.titularPropiedad = titularPropiedad;
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiseños() {
        return diseños;
    }

    public void setDiseños(String diseños) {
        this.diseños = diseños;
    }

    public String getModelosDeUtilidad() {
        return modelosDeUtilidad;
    }

    public void setModelosDeUtilidad(String modelosDeUtilidad) {
        this.modelosDeUtilidad = modelosDeUtilidad;
    }

    public String getModelosIndustriales() {
        return modelosIndustriales;
    }

    public void setModelosIndustriales(String modelosIndustriales) {
        this.modelosIndustriales = modelosIndustriales;
    }

    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    public void setNombrePropiedad(String nombrePropiedad) {
        this.nombrePropiedad = nombrePropiedad;
    }

    public String getPatenteDeInvencion() {
        return patenteDeInvencion;
    }

    public void setPatenteDeInvencion(String patenteDeInvencion) {
        this.patenteDeInvencion = patenteDeInvencion;
    }

    public String getTitularPropiedad() {
        return titularPropiedad;
    }

    public void setTitularPropiedad(String titularPropiedad) {
        this.titularPropiedad = titularPropiedad;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
    
    @OneToOne
    @JoinColumn (name="id_Marca")
    private Marca marca;
   
}
