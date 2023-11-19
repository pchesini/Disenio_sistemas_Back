/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroPropiedadIndustrial;
import Service.IRegistroPropiedadIndustrial;
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
@RequestMapping("registroIndustrial")
public class RegistroPropiedadIndustrialController {
    @Autowired
    private IRegistroPropiedadIndustrial regPropIndustrialI;

    @GetMapping("/lista")
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial(){
        return regPropIndustrialI.getRegistroPropiedadIndustrial();
    }

    @PostMapping("/alta")
    public String saveRegistroPropiedadIndustrial(@RequestBody RegistroPropiedadIndustrial reg){
        regPropIndustrialI.saveRegistroPropiedadIndustrial(reg);
        return "Se creo el Registro Propiedad Industrial Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteRegistroPropiedadIndustrial(@PathVariable Long id) {
        regPropIndustrialI.deleteRegistroPropiedadIndustrial(id);
        return " Registro Propiedad Industrial Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public RegistroPropiedadIndustrial editarRegistroPropiedadIndustrial(@PathVariable Long id,
                               @RequestParam("nombrePropiedad") String nuevoNombre,
                               @RequestParam("tipoLicencia") String nuevoTipo,
                               @RequestParam("titularPropiedad") String nuevoTitular) {
        RegistroPropiedadIndustrial regPropiIndus = regPropIndustrialI.buscarRegistroPropiedadIndustrial(id);
        regPropiIndus.setNombrePropiedad(nuevoNombre);
        regPropiIndus.setTipoLicencia(nuevoTipo);
        regPropiIndus.setTitularPropiedad(nuevoTitular);
       

        regPropIndustrialI.saveRegistroPropiedadIndustrial(regPropiIndus);

        return regPropiIndus;
}
}

