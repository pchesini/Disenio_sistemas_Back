/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.CapituloLibro;
import Repository.CapituloLibroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapituloLibroService implements ICapituloLibroService {
    
    @Autowired
    private CapituloLibroRepository capituloLibroR;
    @Override
    public List<CapituloLibro> getCapituloLibro() {
        List<CapituloLibro> listaCapitulosLibro;
        listaCapitulosLibro = capituloLibroR.findAll();
        return listaCapitulosLibro;    }

    @Override
    public void saveCapituloLibro(CapituloLibro of) {
        capituloLibroR.save(of);
    }

    @Override
    public void deleteCapituloLibro(Long id) {
        capituloLibroR.deleteById(id);
    }

    @Override
    public CapituloLibro buscarCapituloLibro(long id) {
        CapituloLibro capituloLibro;
        capituloLibro = capituloLibroR.findById(id).orElse(null);
        return capituloLibro;    }
    
}
