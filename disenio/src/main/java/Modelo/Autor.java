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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    public Autor(Long id, String nombre, String apellido, Set<ReunionCientifica> reunionesCientificas, ArticuloConReferato autorConReferato, Publicacion publicacion, Trabajo trabajo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.reunionesCientificas = reunionesCientificas;
        this.autorConReferato = autorConReferato;
        this.publicacion = publicacion;
        this.trabajo = trabajo;
    }

    
    //cambie multiplicidad
    @OneToMany(mappedBy = "autor")
    private Set<ReunionCientifica> reunionesCientificas = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "ArticuloConReferato_Autor",
        joinColumns = @JoinColumn(name = "id_ArticuloConReferato"),
        inverseJoinColumns = @JoinColumn(name = "id_Autor")
    )
    private ArticuloConReferato autorConReferato;

    @OneToMany
    @JoinColumn (name="id_publicacion")
    private Publicacion publicacion;

    @OneToOne
    @JoinColumn (name="id_Trabajo")
    private Trabajo trabajo;
    
}
