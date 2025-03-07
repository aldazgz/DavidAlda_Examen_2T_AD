package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Aula;
import com.example.DavidAlda_Examen_2T.model.Curso;
import com.example.DavidAlda_Examen_2T.model.Profesor;
import com.example.DavidAlda_Examen_2T.repository.AulaRepository;
import com.example.DavidAlda_Examen_2T.repository.CursoRepository;
import com.example.DavidAlda_Examen_2T.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceIMP implements CursoService{
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private AulaRepository aulaRepository;
    @Autowired
    private ProfesorRepository profesorRepository;
    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> obtenerCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso obtenerCursoPorAula(int aulaId) {
        Optional<Aula> aula = aulaRepository.findById(aulaId);
        return aula.orElseThrow().getCurso();
    }

    @Override
    public List<Curso> obtenerCursosPorProfesor(int profesorId) {
        Optional<Profesor> profesor = profesorRepository.findById(profesorId);
        return profesor.orElseThrow().getCursos();
    }
}
