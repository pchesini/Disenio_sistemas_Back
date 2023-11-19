/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.RegistroPropiedadIndustrial;
import Repository.RegistroPropiedadIndustrialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroPropiedadIndustrialService implements IRegistroPropiedadIndustrial {
    
    @Autowired
    private RegistroPropiedadIndustrialRepository registroPropiedadIndustrialR;
    @Override
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial() {
        List<RegistroPropiedadIndustrial> listaRegistroPropiedadIndustrial = registroPropiedadIndustrialR.findAll();
        return listaRegistroPropiedadIndustrial;    }

    @Override
    public void saveRegistroPropiedadIndustrial(RegistroPropiedadIndustrial of) {
        registroPropiedadIndustrialR.save(of);
    }

    @Override
    public void deleteRegistroPropiedadIndustrial(Long id) {
        registroPropiedadIndustrialR.deleteById(id);
    }

    @Override
    public RegistroPropiedadIndustrial buscarRegistroPropiedadIndustrial(Long id) {
        RegistroPropiedadIndustrial registroPropiedadIndustrial = registroPropiedadIndustrialR.findById(id).orElse(null);
        return registroPropiedadIndustrial;    }
    
}
