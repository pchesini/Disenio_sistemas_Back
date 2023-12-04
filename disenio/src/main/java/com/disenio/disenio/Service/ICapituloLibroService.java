/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.CapituloLibro;
import java.util.List;


public interface ICapituloLibroService {
     public List<CapituloLibro> getCapituloLibro();
    public void saveCapituloLibro(CapituloLibro of);
    public void deleteCapituloLibro(Long id);
    public CapituloLibro buscarCapituloLibro(long id);
}
