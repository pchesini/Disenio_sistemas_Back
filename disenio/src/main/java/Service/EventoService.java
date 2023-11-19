/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Evento;
import Repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEventoService{
    
    @Autowired
    private EventoRepository eventoR;

    @Override
    public List<Evento> getEvento() {
        List<Evento> listaEventos = eventoR.findAll();
        return listaEventos; 
    }

    @Override
    public void saveEvento(Evento of) {
        eventoR.save(of);
    }

    @Override
    public void deleteEvento(Long id) {
        eventoR.deleteById(id);
    }

    @Override
    public Evento buscarEvento(long id) {
        Evento evento;
        evento = eventoR.findById(id).orElse(null);
        return evento;    }
    
}
