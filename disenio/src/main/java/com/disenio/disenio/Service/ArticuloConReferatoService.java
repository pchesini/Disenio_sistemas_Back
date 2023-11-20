/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.ArticuloConReferato;
import com.disenio.disenio.Repository.ArticuloConReferatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloConReferatoService implements IArticuloConReferato{
    
     
    @Autowired 
    private ArticuloConReferatoRepository articuloConReferatoR;

    @Override
    public List<ArticuloConReferato> getArticuloConReferato() {
        List<ArticuloConReferato> listaArticuloConReferato = articuloConReferatoR.findAll();
        return listaArticuloConReferato;    }

    @Override
    public void saveArticuloConReferato(ArticuloConReferato of) {
        articuloConReferatoR.save(of);    }

    @Override
    public void deleteArticuloConReferato(Long id) {
                articuloConReferatoR.deleteById(id);

        }

    @Override
    public ArticuloConReferato buscarArticuloConReferato(long id) {
        ArticuloConReferato articuloConReferato = articuloConReferatoR.findById(id).orElse(null);// aca deberia implemenarse una logica para devolver algun mensaje
        return articuloConReferato;
    }
    
}
