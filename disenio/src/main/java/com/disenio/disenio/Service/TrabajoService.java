/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Trabajo;
import com.disenio.disenio.Repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajo{

     @Autowired
    private TrabajoRepository trabajoR;
    @Override
    public List<Trabajo> getTrabajo() {
         List<Trabajo> listaTrabajos = trabajoR.findAll();
        return listaTrabajos; 
    }

    @Override
    public void saveTrabajo(Trabajo tra) {
        trabajoR.save(tra);
    }

    @Override
    public void deleteTrabajo(Long id) {
        trabajoR.deleteById(id);   
    }

    @Override
    public Trabajo buscarTrabajo(long id) {
        Trabajo tra;
        tra = trabajoR.findById(id).orElse(null);
        return tra;      
    }
    
}
