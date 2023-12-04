/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.RegistroPropiedadIntelectual;
import com.disenio.disenio.Repository.RegistroPropiedadIntelectualRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroPropiedadIntelectualService implements IRegistroPropiedadIntelectual{
    
    @Autowired
    private RegistroPropiedadIntelectualRepository registroPropiedadIntelectualR;
    @Override
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual() {
        List<RegistroPropiedadIntelectual> listaRegistroPropiedadIntelectual = registroPropiedadIntelectualR.findAll();
        return listaRegistroPropiedadIntelectual;    }

    @Override
    public void saveRegistroPropiedadIntelectual(RegistroPropiedadIntelectual of) {
        registroPropiedadIntelectualR.save(of);
    }

    @Override
    public void deleteRegistroPropiedadIntelectual(Long id) {
        registroPropiedadIntelectualR.deleteById(id);
    }

    @Override
    public RegistroPropiedadIntelectual buscarRegistroPropiedadIntelectual(Long id) {
        RegistroPropiedadIntelectual registroPropiedadIntelectual = registroPropiedadIntelectualR.findById(id).orElse(null);
        return registroPropiedadIntelectual;    }
    
}
