
package com.disenio.disenio.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class authController {
    
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
    
}
