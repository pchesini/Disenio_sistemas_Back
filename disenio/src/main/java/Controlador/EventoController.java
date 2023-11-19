/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Evento;
import Service.IEventoService;
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
@RequestMapping("articuloConReferato")
public class EventoController {
     @Autowired
    private IEventoService eventoI;

    @GetMapping("/consulta")
    public List<Evento> getEvento(){
        return eventoI.getEvento();
    }

    @PostMapping("/alta")
    public String saveEvento(@RequestBody Evento of){
        eventoI.saveEvento(of);
        return "Se creo el Evento Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteEvento(@PathVariable Long id) {
        eventoI.deleteEvento(id);
        return " Evento con referato Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public Evento editarEvento(@PathVariable Long id,
                               @RequestParam("descripcionEvento") String nuevaDescripcionEvento,
                               @RequestParam("fechaEvento") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevaFechaEvento,
                               @RequestParam("lugarEvento") String nuevoLugarEvento,
                               @RequestParam("nombreEvento")String nuevoNombreEvento
    ){

        Evento evento = eventoI.buscarEvento(0);
        evento.setDescripcionEvento(nuevaDescripcionEvento);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevaFechaEvento.getTime());
        evento.setFechaEvento(ConvertirASql);
        evento.setLugarEvento(nuevoLugarEvento);
        evento.setNombreEvento(nuevoNombreEvento);

        eventoI.saveEvento(evento);

        return evento;
    }
}
