package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Curso;

import java.util.List;

public interface CursoService {
    Curso agregarCurso(Curso curso);
    List<Curso> obtenerCursos();
    Curso obtenerCursoPorAula(int aulaId);
    List<Curso> obtenerCursosPorProfesor(int profesorId);
}
