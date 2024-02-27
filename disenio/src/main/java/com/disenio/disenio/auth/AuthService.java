/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.auth;

import com.disenio.disenio.Dto.UsuarioDto;
import com.disenio.disenio.Exepciones.AutenticacionException;
import com.disenio.disenio.Modelo.Usuario;
import com.disenio.disenio.Repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuth{
    
    @Autowired
    private UsuarioRepository usuarioR;
    
    @Override
    public UsuarioDto login(String email, String password) {
   // Buscar el usuario por su email
        Optional<Usuario> optionalUsuario = usuarioR.findByEmail(email);

        // Verificar si se encontró un usuario y si la contraseña coincide
        if (optionalUsuario.isPresent() && optionalUsuario.get().getPassword().equals(password)) {
            // Crear y devolver un DTO del usuario autenticado
            Usuario usuario = optionalUsuario.get();
            UsuarioDto usuarioDto = new UsuarioDto();
            usuarioDto.setId(usuario.getId());
            usuarioDto.setNombre(usuario.getNombre());
            usuarioDto.setApellido(usuario.getApellido());
            //usuarioDto.setEmail(usuario.getEmail());
            
            return usuarioDto;
        } else {
           throw new AutenticacionException("Credenciales inválidas");
        }
    }
    
    
    
}
