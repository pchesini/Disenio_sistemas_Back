/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
/*
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
@RequestMapping("registroPropiedadIndustrial")
public class RegistroPropiedadIndustrialController {
    @Autowired
    private IRegistroPropiedadIndustrial registroPropiedadIndustrialI;

    @GetMapping("/consulta")
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial(){
        return registroPropiedadIndustrialI.getRegistroPropiedadIndustrial();
    }

    @PostMapping("/alta")
    public String saveRegistroPropiedadIndustrial(@RequestBody RegistroPropiedadIndustrial of){
        registroPropiedadIndustrialI.saveRegistroPropiedadIndustrial(of);
        return "Se creo el Registro Propiedad Industrial Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteRegistroPropiedadIndustrial(@PathVariable Long id) {
        registroPropiedadIndustrialI.deleteRegistroPropiedadIndustrial(id);
        return " Registro Propiedad Industrial Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public RegistroPropiedadIndustrial editarRegistroPropiedadIndustrial(@PathVariable Long id,
                               @RequestParam("nombreRegistroI") String nuevoNombre,
                               @RequestParam("tipoRegistroI") String nuevoTipo,
                               @RequestParam("titularRegistroI") String nuevoTitularI,@RequestParam("marcaRegistroI") String nuevaMarcaI){
        RegistroPropiedadIndustrial registroPropiedadIndustrial = registroPropiedadIndustrialI.buscarRegistroPropiedadIndustrial(0);
        registroPropiedadIndustrial.setNombrePropiedad(nuevoNombre);
        registroPropiedadIndustrial.setTipoLicencia(nuevoTipo);
        registroPropiedadIndustrial.setTitularPropiedad(nuevoTitularI);
        registroPropiedadIndustrial.setMarca(marca);

        registroPropiedadIndustrialI.saveRegistroPropiedadIndustrial(registroPropiedadIndustrial);

        return registroPropiedadIndustrial;
}
}
*/
