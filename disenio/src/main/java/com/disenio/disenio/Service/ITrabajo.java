/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Trabajo;
import java.util.List;


public interface ITrabajo {
    public List<Trabajo> getTrabajo();
    public void saveTrabajo(Trabajo tra);
    public void deleteTrabajo(Long id);
    public Trabajo buscarTrabajo(long id);

}
