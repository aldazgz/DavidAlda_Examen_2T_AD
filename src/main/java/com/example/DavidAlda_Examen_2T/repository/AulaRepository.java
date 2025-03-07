package com.example.DavidAlda_Examen_2T.repository;

import com.example.DavidAlda_Examen_2T.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AulaRepository extends JpaRepository<Aula,Integer> {
    @Query("FROM Aula a WHERE a.capacidad > :capacidad")
    List<Aula> getAulaPorCapacidad(@Param("capacidad") int capacidad);
}
