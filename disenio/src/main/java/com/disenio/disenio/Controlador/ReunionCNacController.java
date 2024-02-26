/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Controlador;


import com.disenio.disenio.Exepciones.ReunionNotFoundException;
import com.disenio.disenio.Modelo.ReunionCNac;
import com.disenio.disenio.Service.ReunionCNacService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Reunion-nacional")
public class ReunionCNacController {
    
    @Autowired
    private ReunionCNacService reunionS;
    
    @PostMapping("/alta")
    public String altaReunionNac(@RequestBody ReunionCNac reunion){
        reunionS.crearReunion(reunion);
        return ("Se creo La Reunion con Titulo : " + reunion.getTituloTrabajo());
    }
    @GetMapping("{id}")
    public ReunionCNac getReunion(@PathVariable Long id){
        return reunionS.getReunion(id).orElseThrow(() ->
                new ReunionNotFoundException("La reunión con el ID " + id + " no existe."));
    }
    
    @GetMapping("/lista")
    public List<ReunionCNac> getAllReunion(){
        return reunionS.getAllReunion();
    }
     @DeleteMapping("/baja/{id}")
     public String bajaReunion(@PathVariable Long id){
         reunionS.deleteReunion(id);
         return ("Reunion eliminada");
     }
    /*@PutMapping ("/editar/{id}")
    public ReunionCNac editarReunion(@PathVariable Long id,
                               @RequestParam("nombrePropiedad") String nuevoNombre,
                               @RequestParam("tipoLicencia") String nuevoTipo,
                               @RequestParam("titularPropiedad") String nuevoTitular) {
        ReunionCNac reunion = regPropIndustrialI.buscarRegistroPropiedadIndustrial(id);
        reunion.setNombrePropiedad(nuevoNombre);
        reunion.setTipoLicencia(nuevoTipo);
        reunion.setTitularPropiedad(nuevoTitular);
*/
}
