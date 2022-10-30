package com.portfolio.ErikWagner.repository;

import com.portfolio.ErikWagner.entity.Rol;
import com.portfolio.ErikWagner.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}