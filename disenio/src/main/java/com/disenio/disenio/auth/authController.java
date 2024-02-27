
package com.disenio.disenio.auth;

import com.disenio.disenio.Dto.UsuarioDto;
import com.disenio.disenio.Exepciones.AutenticacionException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class authController {
    
    @Autowired
    private AuthService authService;
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioDto usuarioDto) {
        try {
            String email = usuarioDto.getEmail();
            String password = usuarioDto.getPassword();
            UsuarioDto usuarioAutenticado = authService.login(email, password);
            return ResponseEntity.ok(usuarioAutenticado);
        } catch (AutenticacionException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }
    /*
    @PostMapping(value = "login")
    public String login(){
        return "Ingresó";
    }
     @PostMapping(value = "registro")
     public String registro(){
         return " Se registró";
     }
    public authController() {
    }
    */
}
