/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Exepciones.ReunionNotFoundException;
import com.disenio.disenio.Modelo.ReunionCNac;
import com.disenio.disenio.Repository.ReunionCNacRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReunionCNacService implements IReunionCNac{
    
    @Autowired
    private ReunionCNacRepository reunionR;

    @Override
    public ReunionCNac crearReunion(ReunionCNac reunion) {
            Optional<ReunionCNac> reunionExistente = reunionR.findById(reunion.getId());
    if (reunionExistente.isPresent() && reunionExistente.get().isEliminado()) {
        // La reunión existe pero está marcada como eliminada, por lo tanto, la actualizamos
        reunionExistente.get().setEliminado(false);
        return reunionR.save(reunionExistente.get());
    } else {
        // La reunión no existe o no está marcada como eliminada, por lo tanto, la creamos
        return reunionR.save(reunion);
    }
}

    @Override
    public Optional<ReunionCNac> getReunion(Long id) {
       return reunionR.findByIdAndEliminadoFalse(id);
}

    @Override
    public List<ReunionCNac> getAllReunion() {
      return reunionR.findByEliminadoFalse();
}
    // este metodo no esta implementado en el controller xq creo que no es necesario
    @Override
    public ReunionCNac buscarReunion(Long id) {
        Optional<ReunionCNac> reunionOptional = reunionR.findByIdAndEliminadoFalse(id);
            if (reunionOptional.isPresent()) {
                return reunionOptional.get();
            } else {
                 throw new ReunionNotFoundException("La Reunión con el ID: " + id + " no existe o fue eliminada.");
    }    }

    @Override
    public void deleteReunion(Long id) {
    Optional<ReunionCNac> reunionOptional = reunionR.findById(id);
    
    if (reunionOptional.isPresent()) {
        ReunionCNac reunion = reunionOptional.get();
        reunion.setEliminado(true); // Marcar como eliminado
        reunionR.save(reunion);
    } else {
        throw new ReunionNotFoundException("La reunión con el ID " + id + " no existe.");
        }    
    }
}