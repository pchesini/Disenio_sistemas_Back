/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Patente;
import Service.IPatente;
import java.sql.Date;
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
@RequestMapping("/patente")
public class PatenteController {
    @Autowired
    private IPatente patI;

    @GetMapping("/lista")
    public List<Patente> getPatente(){
        return patI.getPatente();
    }

    @PostMapping("/alta")
    public String savePatente(@RequestBody Patente pat){
        patI.savePatente(pat);
        return "Se creo la patente Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteArticuloConReferato(@PathVariable Long id) {
        patI.deletePatente(id);
        return " Patente  Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public Patente editarArticuloConReferato(@PathVariable Long id,
                               @RequestParam("titularPatente") String nuevotitularPatente,
                               @RequestParam("fechaPresentacion") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevafechaPresentacion,
                               @RequestParam("tituloDeInventario") String nuevotituloDeInventario){


        Patente pat = patI.buscarPatente(0);
        pat.setTitularPatente(nuevotitularPatente);
        pat.setFechaPresentacion(nuevafechaPresentacion);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevafechaPresentacion.getTime());
        pat.setTituloDeInventario(nuevotituloDeInventario);
        patI.savePatente(pat);

        return pat;
    }
}
