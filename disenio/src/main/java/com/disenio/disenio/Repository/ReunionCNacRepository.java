
package com.disenio.disenio.Repository;

import com.disenio.disenio.Modelo.ReunionCNac;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReunionCNacRepository extends JpaRepository<ReunionCNac, Long>{
    Optional<ReunionCNac> findByIdAndEliminadoFalse(Long id);

    List<ReunionCNac> findByEliminadoFalse();
}
