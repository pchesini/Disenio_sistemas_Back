/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.RegistroPropiedadIntelectual;
import java.util.List;

public interface IRegistroPropiedadIntelectual {
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual();
    public void saveRegistroPropiedadIntelectual(RegistroPropiedadIntelectual of);
    public void deleteRegistroPropiedadIntelectual(Long id);
    public RegistroPropiedadIntelectual buscarRegistroPropiedadIntelectual(Long id);
}
