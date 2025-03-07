package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Aula;

import java.util.List;

public interface AulaService {
    Aula agregarAula(Aula aula);
    List<Aula> obtenerAulas();
    List<Aula> obtenerAulasPorCapacidad(int capacidad);
}
