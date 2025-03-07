package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Alumno;

import java.util.List;

public interface AlumnoService {
    Alumno agregarAlumno(Alumno alumno);
    List<Alumno> obtenerAlumnos();
    List<Alumno> obtenerAlumnosPorCurso(int cursoId);
}
