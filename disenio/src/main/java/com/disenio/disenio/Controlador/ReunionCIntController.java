
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Exepciones.ReunionNotFoundException;
import com.disenio.disenio.Modelo.ReunionCInt;
import com.disenio.disenio.Service.ReunionCIntService;
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
@RequestMapping("/Reunion-internacional")
public class ReunionCIntController {
    @Autowired
    private ReunionCIntService reunionS;
    
    @PostMapping("/alta")
    public String altaReunionNac(@RequestBody ReunionCInt reunion){
        reunionS.crearReunion(reunion);
        return ("Se creo La Reunion con Titulo : " + reunion.getTituloTrabajo());
    }
    @GetMapping("{id}")
    public ReunionCInt getReunion(@PathVariable Long id){
        return reunionS.getReunion(id).orElseThrow(() ->
                new ReunionNotFoundException("La reunión con el ID " + id + " no existe."));
    }
    
    @GetMapping("/lista")
    public List<ReunionCInt> getAllReunion(){
        return reunionS.getAllReunion();
    }
     @DeleteMapping("/baja/{id}")
     public String bajaReunion(@PathVariable Long id){
         reunionS.deleteReunion(id);
         return ("Reunion eliminada");
     }
}
