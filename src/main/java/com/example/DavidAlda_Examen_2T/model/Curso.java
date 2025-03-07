package com.example.DavidAlda_Examen_2T.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;
    @Column
    private String nombre;
    @JsonBackReference(value = "curso-alumno")
    @OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
    private List<Alumno> alumnos;
    @JsonBackReference(value = "curso-profesor")
    @ManyToMany(mappedBy = "cursos", fetch = FetchType.EAGER)
    private List<Profesor> profesores;
    @JsonBackReference(value = "curso-aula")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_aula")
    private Aula aula;

    public Curso(int id_curso, String nombre, List<Alumno> alumnos, List<Profesor> profesores, Aula aula) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesores = profesores;
        this.aula = aula;
    }

    public Curso() {
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}
