
package com.disenio.disenio.Service;

import com.disenio.disenio.Exepciones.ReunionNotFoundException;
import com.disenio.disenio.Modelo.ReunionCInt;
import com.disenio.disenio.Repository.ReunionCIntRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReunionCIntService implements IReunionCInt{

    @Autowired
    private ReunionCIntRepository reunionR;
    
    @Override
    public ReunionCInt crearReunion(ReunionCInt reunion) {
         Optional<ReunionCInt> reunionExistente = reunionR.findById(reunion.getId());
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
    public Optional<ReunionCInt> getReunion(Long id) {
          return reunionR.findByIdAndEliminadoFalse(id);
    }

    @Override
    public List<ReunionCInt> getAllReunion() {
       return reunionR.findByEliminadoFalse();
    }
   

    @Override
    public void deleteReunion(Long id) {
         
    Optional<ReunionCInt> reunionOptional = reunionR.findById(id);
    
    if (reunionOptional.isPresent()) {
        ReunionCInt reunion = reunionOptional.get();
        reunion.setEliminado(true); // Marcar como eliminado
        reunionR.save(reunion);
    } else {
        throw new ReunionNotFoundException("La reunión con el ID " + id + " no existe.");
        }   
    }

    @Override
    public ReunionCInt buscarReunion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
