
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.ReunionCInt;
import java.util.List;
import java.util.Optional;


public interface IReunionCInt {
     public ReunionCInt crearReunion(ReunionCInt reunion);
    public Optional <ReunionCInt> getReunion (Long id);
    public List <ReunionCInt> getAllReunion();
    public ReunionCInt buscarReunion(Long id);
    public void deleteReunion(Long id);
}
