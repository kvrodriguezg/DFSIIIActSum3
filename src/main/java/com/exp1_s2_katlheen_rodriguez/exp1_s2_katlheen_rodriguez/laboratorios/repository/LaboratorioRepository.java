package com.exp1_s2_katlheen_rodriguez.exp1_s2_katlheen_rodriguez.laboratorios.repository;
import com.exp1_s2_katlheen_rodriguez.exp1_s2_katlheen_rodriguez.laboratorios.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//Repositorio desde JPA
public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
    List<Laboratorio> findByTipoAnalisis(String tipoAnalisis);
}