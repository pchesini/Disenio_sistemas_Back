/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.ComunicacionCientifica;
import com.disenio.disenio.Repository.ComunicacionCientificaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComunicacionCientificaService implements IComunicacionCientificaService{
    
    @Autowired
    private ComunicacionCientificaRepository comunicacionCientificaR;
        
    @Override
    public List<ComunicacionCientifica> getComunicacionCientifica() {
        List<ComunicacionCientifica> listaCapitulosLibro;
        listaCapitulosLibro = comunicacionCientificaR.findAll();
        return listaCapitulosLibro;    }

    @Override
    public void saveComunicacionCientifica(ComunicacionCientifica of) {
        comunicacionCientificaR.save(of);
    }

    @Override
    public void deleteComunicacionCientifica(Long id) {
        comunicacionCientificaR.deleteById(id);
    }

    @Override
    public ComunicacionCientifica buscarComunicacionCientifica(long id) {
        ComunicacionCientifica comunicacionCientifica;
        comunicacionCientifica = comunicacionCientificaR.findById(id).orElse(null);
        return comunicacionCientifica;    }
    
}
