/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Modelo.Usuario;
import java.util.Optional;


public interface IUsuario {
    Optional <Usuario> getUsuario(String email);
    public Usuario altaUsuario(Usuario usuario);
    public Usuario modContrasenia(String email, String password);
   // 
   
}
