/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
/*
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
@RequestMapping("registroPropiedadIntelectual")
public class RegistroPropiedadIntelectualController {
     @Autowired
    private IRegistroPropiedadIntelectual registroPropiedadIntelectualI;

    @GetMapping("/consulta")
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual(){
        return registroPropiedadIntelectualI.getRegistroPropiedadIntelectual();
    }

    @PostMapping("/alta")
    public String saveRegistroPropiedadIntelectual(@RequestBody RegistroPropiedadIntelectual of){
        registroPropiedadIntelectualI.saveRegistroPropiedadIntelectual(of);
        return "Se creo el Registro Propiedad Intelectual Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteRegistroPropiedadIntelectual(@PathVariable Long id) {
        registroPropiedadIntelectualI.deleteRegistroPropiedadIntelectual(id);
        return " Registro Propiedad Intelectual Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public RegistroPropiedadIntelectual editarRegistroPropiedadIntelectual(@PathVariable Long id,
                               @RequestParam("nombreRegistro") String nuevoRegistro,
                               @RequestParam("disenoRegistro") String nuevoDiseno,
                               @RequestParam("modeloUtilidadRegistro") String nuevoModeloUtilidad,
                               @RequestParam("modeloIndustrialRegistro") String nuevoModeloIndustrial,
                               @RequestParam("patenteRegistro") String nuevaPatente,
                               @RequestParam("titularRegistro") String nuevoTitular,@RequestParam("marcaRegistro") String nuevaMarca){
        RegistroPropiedadIntelectual registroPropiedadIntelectual = registroPropiedadIntelectualI.buscarRegistroPropiedadIntelectual(0);
        registroPropiedadIntelectual.setNombrePropiedad(nuevoRegistro);
        registroPropiedadIntelectual.setDiseños(nuevoDiseno);
        registroPropiedadIntelectual.setModelosDeUtilidad(nuevoModeloUtilidad);
        registroPropiedadIntelectual.setModelosIndustriales(nuevoModeloIndustrial);
        registroPropiedadIntelectual.setPatenteDeInvencion(nuevaPatente);
        registroPropiedadIntelectual.setTitularPropiedad(nuevoTitular);
        registroPropiedadIntelectual.setMarca(marca);

        registroPropiedadIntelectualI.saveRegistroPropiedadIntelectual(registroPropiedadIntelectual);

        return registroPropiedadIntelectual;
    }
}
*/