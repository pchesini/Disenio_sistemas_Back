/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Modelo.Trabajo;
import com.disenio.disenio.Service.IArticuloConReferato;
import com.disenio.disenio.Service.ITrabajo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trabajo")
public class TrabajoController {
    @Autowired
    private ITrabajo traI;

    @GetMapping("/lista")
    public List<Trabajo> getTrabajo(){
        return traI.getTrabajo();
    }

    @PostMapping("/alta")
    public String saveArticuloConReferato(@RequestBody Trabajo tra){
        traI.saveTrabajo(tra);
        return "Se creo el Trabajo Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteTrabajo(@PathVariable Long id) {
        traI.deleteTrabajo(id);
        return " Trabajo Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public Trabajo editarTrabajo(@PathVariable Long id,
                               @RequestParam("editorial") String nuevoEditorial,
                               @RequestParam("issn") String nuevoIssn,
                               @RequestParam("nombreDeRevista") String nuevoNombreRevista,
                               @RequestParam("pais") String nuevoPais,
                               @RequestParam("tituloDeTrabajo") String nuevotituloDeTrabajo){


        Trabajo trab = traI.buscarTrabajo(0);
        trab.setEditorial(nuevoEditorial);
        trab.setIssn(nuevoIssn);
        trab.setNombreDeRevista(nuevoNombreRevista);
        trab.setPais(nuevoPais);
        trab.setTituloDeTrabajo(nuevotituloDeTrabajo);
        traI.saveTrabajo(trab);

        return trab;
    }

}
