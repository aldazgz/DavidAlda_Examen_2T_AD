package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Profesor;

import java.util.List;

public interface ProfesorService {
    Profesor agregarProfesor(Profesor profesro);
    List<Profesor> obtenerProfesores();
    List<Profesor> obtenerProfesoresPorCurso(int cursoId);
}
