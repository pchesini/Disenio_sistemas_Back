/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Libro;
import Repository.LibroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibro{
    
     @Autowired
    private LibroRepository libroR;
    @Override
    public List<Libro> getLibro() {
        List<Libro> listaLibro;
        listaLibro = libroR.findAll();
        return listaLibro;    }

    @Override
    public void saveLibro(Libro of) {
        libroR.save(of);
    }

    @Override
    public void deleteLibro(Long id) {
        libroR.deleteById(id);
    }

    @Override
    public Libro buscarLibro(long id) {
        Libro libro;
        libro = libroR.findById(id).orElse(null);
        return libro;    }
    
}
