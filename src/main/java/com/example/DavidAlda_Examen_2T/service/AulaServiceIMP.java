package com.example.DavidAlda_Examen_2T.service;

import com.example.DavidAlda_Examen_2T.model.Aula;
import com.example.DavidAlda_Examen_2T.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceIMP implements AulaService{
    @Autowired
    private AulaRepository aulaRepository;
    @Override
    public Aula agregarAula(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public List<Aula> obtenerAulas() {
        return aulaRepository.findAll();
    }

    @Override
    public List<Aula> obtenerAulasPorCapacidad(int capacidad) {
        return aulaRepository.getAulaPorCapacidad(capacidad);
    }
}
