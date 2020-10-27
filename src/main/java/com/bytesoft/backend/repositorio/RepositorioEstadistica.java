package com.bytesoft.backend.repositorio;

import com.bytesoft.backend.modelo.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepositorioEstadistica extends JpaRepository<Estadistica, Integer> {
//    @Query("select cedula, pNom, pApe, bajalogica from usuario;")
//    public List<Estadistica> getTodasLasStats();
}