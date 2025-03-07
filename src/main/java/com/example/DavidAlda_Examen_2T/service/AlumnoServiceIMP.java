package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Alumno;
import com.example.DavidAlda_Examen_2T.model.Curso;
import com.example.DavidAlda_Examen_2T.repository.AlumnoRepository;
import com.example.DavidAlda_Examen_2T.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceIMP implements AlumnoService{
    @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public Alumno agregarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> obtenerAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public List<Alumno> obtenerAlumnosPorCurso(int cursoId) {
        Optional<Curso> curso = cursoRepository.findById(cursoId);
        return curso.orElseThrow().getAlumnos();
    }
}
