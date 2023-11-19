/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CapituloLibro;
import Service.ICapituloLibroService;
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
@RequestMapping("capituloLibro")
public class CapituloLibroController {
    @Autowired
    private ICapituloLibroService capituloLibroI;

    @GetMapping("/consulta")
    public List<CapituloLibro> getCapituloLibro(){

        return capituloLibroI.getCapituloLibro();
    }

    @PostMapping("/alta")
    public String saveCapituloLibro(@RequestBody CapituloLibro of){
        capituloLibroI.saveCapituloLibro(of);
        return "Se creo el Capitulo del libro Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteCapituloLibro(@PathVariable Long id) {
        capituloLibroI.deleteCapituloLibro(id);
        return " Capitulo del libro Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public CapituloLibro editarCapituloLibro(@PathVariable Long id,
                             @RequestParam("nombreCapitulo") String nuevoNombreCapitulo)
    {
        CapituloLibro capituloLibro = capituloLibroI.buscarCapituloLibro(0);
        capituloLibro.setNombreCapitulo(nuevoNombreCapitulo);

        capituloLibroI.saveCapituloLibro(capituloLibro);

        return capituloLibro;
    }
}
