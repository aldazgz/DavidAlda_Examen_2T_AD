package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Curso;
import com.example.DavidAlda_Examen_2T.model.Profesor;
import com.example.DavidAlda_Examen_2T.repository.CursoRepository;
import com.example.DavidAlda_Examen_2T.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceIMP implements  ProfesorService{
    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public Profesor agregarProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public List<Profesor> obtenerProfesores() {
        return profesorRepository.findAll();
    }

    @Override
    public List<Profesor> obtenerProfesoresPorCurso(int cursoId) {
        Optional<Curso> curso = cursoRepository.findById(cursoId);
        return curso.orElseThrow().getProfesores();
    }
}
