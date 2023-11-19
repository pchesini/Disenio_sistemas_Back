/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.Evento;
import java.util.List;


public interface IEventoService {
    
    public List<Evento> getEvento();
    public void saveEvento(Evento of);
    public void deleteEvento(Long id);
    public Evento buscarEvento(long id);
}
