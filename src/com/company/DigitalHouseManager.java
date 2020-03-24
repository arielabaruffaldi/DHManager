package com.company;

import com.company.Profesor.Profesor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DigitalHouseManager {
    private Set<Alumno> listaDeAlumnos;
    private Set<Profesor> listaDeProfesores;
    private Set<Curso> listaDeCursos;
    private Set<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager(List listaDeAlumnos, List listaDeProfesores, List listaDeCursos, List listaDeInscripciones) {
        this.listaDeAlumnos = new HashSet<>();
        this.listaDeProfesores = new HashSet<>();
        this.listaDeCursos = new HashSet<>();
        this.listaDeInscripciones = new HashSet<>();
    }


    public Set<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public Set<Profesor> getListaDeProfesores() {
        return listaDeProfesores;
    }

    public Set<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public Set<Inscripcion> getListaDeInscripciones() {
        return listaDeInscripciones;
    }
}
