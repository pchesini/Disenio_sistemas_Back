
package com.disenio.disenio.Repository;

import com.disenio.disenio.Modelo.ReunionCInt;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReunionCIntRepository extends JpaRepository <ReunionCInt, Long>{
    
    Optional<ReunionCInt> findByIdAndEliminadoFalse(Long id);
    List<ReunionCInt> findByEliminadoFalse();
}
