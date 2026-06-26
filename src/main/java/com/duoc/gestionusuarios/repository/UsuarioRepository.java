package com.duoc.gestionusuarios.repository;

import com.duoc.gestionusuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}