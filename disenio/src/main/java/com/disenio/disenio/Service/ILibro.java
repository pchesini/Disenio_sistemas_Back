/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Libro;
import java.util.List;


public interface ILibro {
     public List<Libro> getLibro();
    public void saveLibro(Libro of);
    public void deleteLibro(Long id);
    public Libro buscarLibro(long id);
}
