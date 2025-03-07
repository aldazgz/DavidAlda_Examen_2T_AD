package com.example.DavidAlda_Examen_2T.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_profesor;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String email;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "profesor_curso", joinColumns = @JoinColumn(name = "id_profesor"), inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private List<Curso> cursos;

    public Profesor(int id_profesor, String nombre, String apellido, String email, List<Curso> cursos) {
        this.id_profesor = id_profesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cursos = cursos;
    }

    public Profesor() {
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
