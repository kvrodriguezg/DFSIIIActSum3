package com.exp1_s2_katlheen_rodriguez.exp1_s2_katlheen_rodriguez.usuarios.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exp1_s2_katlheen_rodriguez.exp1_s2_katlheen_rodriguez.usuarios.model.Usuario;
import java.util.Optional;

//Repositorio
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
}