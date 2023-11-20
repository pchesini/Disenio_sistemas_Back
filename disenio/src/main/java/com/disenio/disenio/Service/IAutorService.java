/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Autor;
import java.util.List;


public interface IAutorService {
     public List<Autor> getAutor();
    public void saveAutor(Autor of);
    public void deleteAutor(Long id);
    public Autor buscarAutor(long id);
}
