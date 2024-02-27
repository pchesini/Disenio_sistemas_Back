/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.auth;

import com.disenio.disenio.Dto.UsuarioDto;
import com.disenio.disenio.Modelo.Usuario;


public interface IAuth {
    public UsuarioDto login(String email, String Password);
}
