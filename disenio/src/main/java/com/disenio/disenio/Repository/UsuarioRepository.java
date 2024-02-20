
package com.disenio.disenio.Repository;

import com.disenio.disenio.Modelo.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    Optional <Usuario> findByEmail(String email);
    
//implementacion de query method
    public Usuario findByEmailAndPassword(String email, String password);
}
