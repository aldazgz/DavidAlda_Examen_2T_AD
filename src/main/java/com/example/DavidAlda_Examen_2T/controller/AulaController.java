package com.example.DavidAlda_Examen_2T.controller;

import com.example.DavidAlda_Examen_2T.model.Aula;
import com.example.DavidAlda_Examen_2T.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {
    @Autowired
    private AulaService aulaService;
    @PostMapping("/add")
    public ResponseEntity<Aula> insertAula(@RequestBody Aula aula){
        return new ResponseEntity<>(aulaService.agregarAula(aula), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Aula>> getAllAulas(){
        return new ResponseEntity<>(aulaService.obtenerAulas(),HttpStatus.OK);
    }
    @GetMapping("/getAulasPorCapacidad")
    public ResponseEntity<List<Aula>> getAulasPorCapacidad(@RequestParam int capacidad){
        return new ResponseEntity<>(aulaService.obtenerAulasPorCapacidad(capacidad),HttpStatus.OK);
    }
}
