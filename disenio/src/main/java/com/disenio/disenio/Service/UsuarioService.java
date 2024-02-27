/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Service;

import com.disenio.disenio.Exepciones.AutenticacionException;
import com.disenio.disenio.Modelo.Usuario;
import com.disenio.disenio.Repository.UsuarioRepository;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuario {
    @Autowired
    private UsuarioRepository usuarioR;
    @Override
    public Optional<Usuario> getUsuario(String email) {
        return usuarioR.findByEmail(email);
    }

    
    //Metodo para registrarse
    @Override
    public Usuario altaUsuario(Usuario usuario) {
        Optional <Usuario> exiteUsuario = usuarioR.findByEmail((usuario.getEmail()));
                if(exiteUsuario.isPresent()){
                    throw new RuntimeException("El usuario Existe");
                }
                return usuarioR.save(usuario);
    }

    @Override
  public Usuario modContrasenia(String email, String newPassword) {
   
    Usuario usuario = usuarioR.findByEmail(email)
            .orElseThrow(() -> new NoSuchElementException("Usuario no encontrado"));

   
    if (newPassword.length() < 8) {
        throw new IllegalArgumentException("La nueva contraseña debe tener al menos 8 caracteres");
    }

    
    usuario.setPassword(newPassword);
    return usuarioR.save(usuario);
}
 
}
