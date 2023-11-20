/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Autor;
import com.disenio.disenio.Repository.AutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService implements IAutorService{

    @Autowired
    private AutorRepository autorR;
    @Override
    public List<Autor> getAutor() {
        List<Autor> listaAutores = autorR.findAll();
        return listaAutores;
    }

    @Override
    public void saveAutor(Autor of) {
        autorR.save(of);
    }

    @Override
    public void deleteAutor(Long id) {
        autorR.deleteById(id);
    }

    @Override
    public Autor buscarAutor(long id) {
        Autor autor= autorR.findById(id).orElse(null);
        return autor;    }
    
}
