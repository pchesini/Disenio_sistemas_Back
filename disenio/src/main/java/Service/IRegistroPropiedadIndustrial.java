/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.RegistroPropiedadIndustrial;
import java.util.List;

public interface IRegistroPropiedadIndustrial {
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial();
    public void saveRegistroPropiedadIndustrial(RegistroPropiedadIndustrial of);
    public void deleteRegistroPropiedadIndustrial(Long id);
    public RegistroPropiedadIndustrial buscarRegistroPropiedadIndustrial(Long id);
}
