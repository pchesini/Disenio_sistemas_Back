/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Modelo.ComunicacionCientifica;
import com.disenio.disenio.Service.IComunicacionCientificaService;
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
@RequestMapping("/comunicacionCientifica")
public class ComunicacionCientificaController {
    @Autowired
    private IComunicacionCientificaService comunicacionCientificaI;

    @GetMapping("/consulta")
    public List<ComunicacionCientifica> getComunicacionCientifica(){
        return comunicacionCientificaI.getComunicacionCientifica();
    }

    @PostMapping("/alta")
    public String saveComunicacionCientifica(@RequestBody ComunicacionCientifica of){
        comunicacionCientificaI.saveComunicacionCientifica(of);
        return "Se creo la Comunicacion Cientifica Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteComunicacionCientifica(@PathVariable Long id) {
        comunicacionCientificaI.deleteComunicacionCientifica(id);
        return " Comunicacion Cientifica Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public ComunicacionCientifica editarComunicacionCientifica(@PathVariable Long id,
                               @RequestParam("lugar") String nuevolugar,
                               @RequestParam("enlace") String nuevoEnlace,
                               @RequestParam("tipo") String nuevoTipo,
                               @RequestParam("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevaFecha){


        ComunicacionCientifica comunicacionCientifica = comunicacionCientificaI.buscarComunicacionCientifica(0);
        comunicacionCientifica.setLugar(nuevolugar);
        comunicacionCientifica.setEnlace(nuevoEnlace);
        comunicacionCientifica.setTipo(nuevoTipo);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevaFecha.getTime());
        comunicacionCientifica.setFecha(ConvertirASql);

        comunicacionCientificaI.saveComunicacionCientifica(comunicacionCientifica);

        return comunicacionCientifica;
    }
}
