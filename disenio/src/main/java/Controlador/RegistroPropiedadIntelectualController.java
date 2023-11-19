/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroPropiedadIntelectual;
import Service.IRegistroPropiedadIntelectual;
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
@RequestMapping("registroIntelectual")
public class RegistroPropiedadIntelectualController {
     @Autowired
    private IRegistroPropiedadIntelectual registroIntelectualI;

    @GetMapping("/consulta")
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual(){
        return registroIntelectualI.getRegistroPropiedadIntelectual();
    }

    @PostMapping("/alta")
    public String saveRegistroPropiedadIntelectual(@RequestBody RegistroPropiedadIntelectual of){
        registroIntelectualI.saveRegistroPropiedadIntelectual(of);
        return "Se creo el Registro Propiedad Intelectual Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteRegistroPropiedadIntelectual(@PathVariable Long id) {
        registroIntelectualI.deleteRegistroPropiedadIntelectual(id);
        return " Registro Propiedad Intelectual Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public RegistroPropiedadIntelectual editarRegistroPropiedadIntelectual(@PathVariable Long id,
                               @RequestParam("diseño") String nuevodiseño,
                               @RequestParam("modelosDeUtilidad") String nuevomodelosDeUtilidad,
                               @RequestParam("modelosIndustriales") String nuevomodelosIndustriales,
                               @RequestParam("nombrePropiedad") String nuevonombrePropiedad,
                               @RequestParam("patenteDeInvencion") String nuevapatenteDeInvencion,
                               @RequestParam("titularPropiedad") String nuevoTitular){
        RegistroPropiedadIntelectual regPropiedadIntel = registroIntelectualI.buscarRegistroPropiedadIntelectual(id);
        regPropiedadIntel.setDiseño(nuevodiseño);
        regPropiedadIntel.setModelosDeUtilidad(nuevomodelosDeUtilidad);
        regPropiedadIntel.setModelosIndustriales(nuevomodelosIndustriales);
        regPropiedadIntel.setNombrePropiedad(nuevonombrePropiedad);
        regPropiedadIntel.setPatenteDeInvencion(nuevapatenteDeInvencion);
        regPropiedadIntel.setTitularPropiedad(nuevonombrePropiedad);
        ;
        registroIntelectualI.saveRegistroPropiedadIntelectual(regPropiedadIntel);

        return regPropiedadIntel;
    }
}
