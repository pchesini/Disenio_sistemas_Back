/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Patente;
import java.util.List;


public interface IPatente {
    public List<Patente> getPatente();
    public void savePatente(Patente pat);
    public void deletePatente(Long id);
    public Patente buscarPatente(long id);
}
