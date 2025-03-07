package com.example.DavidAlda_Examen_2T.controller;

import com.example.DavidAlda_Examen_2T.model.Curso;
import com.example.DavidAlda_Examen_2T.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @PostMapping("/add")
    public ResponseEntity<Curso> insertCurso(@RequestBody Curso curso){
        return new ResponseEntity<>(cursoService.agregarCurso(curso), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Curso>> getAllCursos(){
        return new ResponseEntity<>(cursoService.obtenerCursos(),HttpStatus.OK);
    }
    @GetMapping("/getByAula")
    public ResponseEntity<Curso> getCursoByAula(@RequestParam int aulaId){
        return new ResponseEntity<>(cursoService.obtenerCursoPorAula(aulaId),HttpStatus.OK);
    }
    @GetMapping("/getByProfesor")
    public ResponseEntity<List<Curso>> getCursosByProfesor(@RequestParam int profesorId){
        return new ResponseEntity<>(cursoService.obtenerCursosPorProfesor(profesorId),HttpStatus.OK);
    }
}
