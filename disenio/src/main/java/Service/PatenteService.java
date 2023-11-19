/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Patente;
import Repository.PatenteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatenteService implements IPatente{
    
     @Autowired 
    private PatenteRepository patR;
    @Override
    public List<Patente> getPatente() {
        List<Patente> listaPatentes = patR.findAll();
        return listaPatentes;    }

    @Override
    public void savePatente(Patente pat) {
        patR.save(pat);
    }

    @Override
    public void deletePatente(Long id) {
        patR.deleteById(id);    }

    @Override
    public Patente buscarPatente(long id) {
        Patente pat = patR.findById(id).orElse(null);
        return pat;    }
    
}
