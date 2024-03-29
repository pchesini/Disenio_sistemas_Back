
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Dto.UsuarioDto;
import com.disenio.disenio.Modelo.Usuario;
import com.disenio.disenio.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = {"http://http://localhost:4200"})
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioS;
    
    @PostMapping("/crear")
    public void crearUsuario(@RequestBody Usuario usu){
        usuarioS.altaUsuario(usu);
       }
   @PostMapping("/modificar")
    public Usuario modContrasenia(@RequestParam("email") String email,
                              @RequestParam("password") String password,
                              @RequestParam("newPassword") String newPassword) {
    Usuario usuario = usuarioS.modContrasenia(email, newPassword);
    return usuario;
    }
    /*@PostMapping("/modificar")
    public Usuario modContrasenia(@RequestParam("email") String email,
                              @RequestBody ModificarContraseniaRequest request) {
    Usuario usuario = usuarioS.modContrasenia(email, request.getNewPassword());
    return usuario;
}*/
   
}
