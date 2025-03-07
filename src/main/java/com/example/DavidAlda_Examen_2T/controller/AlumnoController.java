package com.example.DavidAlda_Examen_2T.controller;

import com.example.DavidAlda_Examen_2T.model.Alumno;
import com.example.DavidAlda_Examen_2T.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;
    @PostMapping("/add")
    public ResponseEntity<Alumno> insertAlumno(@RequestBody Alumno alumno){
        return new ResponseEntity<>(alumnoService.agregarAlumno(alumno),HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Alumno>> getAllAlumnos(){
        return new ResponseEntity<>(alumnoService.obtenerAlumnos(),HttpStatus.OK);
    }
    @GetMapping("/getByCurso")
    public ResponseEntity<List<Alumno>> getAlumnosByCurso(@RequestParam int cursoId){
        return new ResponseEntity<>(alumnoService.obtenerAlumnosPorCurso(cursoId), HttpStatus.OK);
    }
}
