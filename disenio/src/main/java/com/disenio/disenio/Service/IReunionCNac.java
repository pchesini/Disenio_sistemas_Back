
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.ReunionCNac;
import java.util.List;
import java.util.Optional;


public interface IReunionCNac {
    public ReunionCNac crearReunion(ReunionCNac reunion);
    public Optional <ReunionCNac> getReunion (Long id);
    public List <ReunionCNac> getAllReunion();
    public ReunionCNac buscarReunion(Long id);
    public void deleteReunion(Long id);
}
