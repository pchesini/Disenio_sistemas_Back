/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.RegistroPropiedadIndustrial;
import com.disenio.disenio.Repository.RegistroPropiedadIndustrialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroPropiedadIndustrialService implements IRegistroPropiedadIndustrial {
    
    @Autowired
    private RegistroPropiedadIndustrialRepository registroPR;
    @Override
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial() {
        List<RegistroPropiedadIndustrial> listaRegistro = registroPR.findAll();
        return listaRegistro;    }

    @Override
    public void saveRegistroPropiedadIndustrial(RegistroPropiedadIndustrial of) {
        registroPR.save(of);
    }

    @Override
    public void deleteRegistroPropiedadIndustrial(Long id) {
        registroPR.deleteById(id);
    }

    @Override
    public RegistroPropiedadIndustrial buscarRegistroPropiedadIndustrial(Long id) {
        RegistroPropiedadIndustrial registroPropiedad = registroPR.findById(id).orElse(null);
        return registroPropiedad;    }
    
}
