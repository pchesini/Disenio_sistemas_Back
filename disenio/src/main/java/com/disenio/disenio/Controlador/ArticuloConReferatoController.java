/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Modelo.ArticuloConReferato;
import com.disenio.disenio.Service.IArticuloConReferato;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
@RequestMapping("/articuloConReferato")
public class ArticuloConReferatoController {
    @Autowired
    private IArticuloConReferato articuloConReferatoI;

    @GetMapping("/lista")
    public List<ArticuloConReferato> getArticuloConReferato(){
        return articuloConReferatoI.getArticuloConReferato();
    }

    @PostMapping("/alta")
    public String saveArticuloConReferato(@RequestBody ArticuloConReferato of){
        articuloConReferatoI.saveArticuloConReferato(of);
        return "Se creo el ArticuloConReferato Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteArticuloConReferato(@PathVariable Long id) {
        articuloConReferatoI.deleteArticuloConReferato(id);
        return " Articulo con referato Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public ArticuloConReferato editarArticuloConReferato(@PathVariable Long id,
                               @RequestParam("lugar") String nuevolugar,
                               @RequestParam("nombreArticulo") String nuevoArticulo,
                               @RequestParam("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevaFecha){


        ArticuloConReferato articuloConReferato = articuloConReferatoI.buscarArticuloConReferato(0);
        articuloConReferato.setLugar(nuevolugar);
        articuloConReferato.setNombreArticulo(nuevoArticulo);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevaFecha.getTime());
        articuloConReferato.setFecha(ConvertirASql);

        articuloConReferatoI.saveArticuloConReferato(articuloConReferato);

        return articuloConReferato;
    }
}
