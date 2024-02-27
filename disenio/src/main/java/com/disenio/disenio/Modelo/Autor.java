/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Modelo;

import com.disenio.disenio.Modelo.ArticuloConReferato;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Autor {
     @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;

    public Autor() {
    }
    // cada vez que cargamos un autor tenemos que ingresarkle un trabajo,publicacion o Reunion?
    // quizas deberiamos en cada clase Publicacion, trabajo etc asociarlo por parametro a un autor.
    public Autor(Long id, String nombre, String apellido, Set<ArticuloConReferato> articulosConReferato, Set<Trabajo> trabajo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
       // this.reunionesCientificas = reunionesCientificas;
        this.articulosConReferato = articulosConReferato;
        //this.publicaciones = publicaciones;
        this.trabajos = trabajos;
    }

    
    /*cambie multiplicidad
    @OneToMany(mappedBy = "autor")
    private Set<ReunionCientifica> reunionesCientificas = new HashSet<>();
*/
    //1 autor a muchos AriculosConR..
   @OneToMany(mappedBy = "autor")
    private Set<ArticuloConReferato> articulosConReferato = new HashSet<>();
    
   /*
    @OneToMany(mappedBy = "id_autor_publicacion")
    private Set<Publicacion> publicaciones = new HashSet<>();
    */
    
    @OneToMany(mappedBy = "autor")
    private Set<Trabajo> trabajos = new HashSet<>();
    
}
