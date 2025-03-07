package com.example.DavidAlda_Examen_2T.controller;

import com.example.DavidAlda_Examen_2T.model.Profesor;
import com.example.DavidAlda_Examen_2T.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;
    @PostMapping("/add")
    public ResponseEntity<Profesor> insertProfesor(@RequestBody Profesor profesor){
        return new ResponseEntity<>(profesorService.agregarProfesor(profesor), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Profesor>> getAllProfesores(){
        return new ResponseEntity<>(profesorService.obtenerProfesores(),HttpStatus.OK);
    }
    @GetMapping("/getByCurso")
    public ResponseEntity<List<Profesor>> getProfesoresByCurso(@RequestParam int cursoId){
        return new ResponseEntity<>(profesorService.obtenerProfesoresPorCurso(cursoId),HttpStatus.OK);
    }
}
