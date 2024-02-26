/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disenio.disenio.Repository;

import com.disenio.disenio.Modelo.ReunionCInt;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReunionCientificaIntRepository extends JpaRepository <ReunionCInt, Long> {
    Optional<ReunionCInt> findByIdAndEliminadoFalse(Long id);
    List<ReunionCInt> findByEliminadoFalse();
}
