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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CertificadoAptitudTecnica {
      @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String aptitudDelEmpleo;
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    private String denominacionComercial;
    private String direccion;
    private String email;
    private String numCat;
    private String telefono;
    private String titular;

    public CertificadoAptitudTecnica() {
    }

    public CertificadoAptitudTecnica(Long id, String aptitudDelEmpleo, Date vencimiento, String denominacionComercial, String direccion, String email, String numCat, String telefono, String titular) {
        this.id = id;
        this.aptitudDelEmpleo = aptitudDelEmpleo;
        this.vencimiento = vencimiento;
        this.denominacionComercial = denominacionComercial;
        this.direccion = direccion;
        this.email = email;
        this.numCat = numCat;
        this.telefono = telefono;
        this.titular = titular;
    }
    
    
}
