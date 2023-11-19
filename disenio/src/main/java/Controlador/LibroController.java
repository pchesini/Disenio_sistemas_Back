/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Service.ILibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("libro")
public class LibroController {
    @Autowired
    private ILibro libroI;

    @GetMapping("/consulta")
    public List<Libro> getLibro(){

        return libroI.getLibro();
    }

    @PostMapping("/alta")
    public String saveLibro(@RequestBody Libro of){
        libroI.saveLibro(of);
        return "Se creo el libro Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteLibro(@PathVariable Long id) {
        libroI.deleteLibro(id);
        return " Capitulo del libro Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public Libro editarLibro(@PathVariable Long id,
                             @RequestParam("nombreLibro") String nuevoNombreLibro)
    {
        Libro libro = libroI.buscarLibro(0);
        libro.setNombreLibro(nuevoNombreLibro);

        libroI.saveLibro(libro);

        return libro;
    }
}
