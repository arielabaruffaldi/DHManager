package com.company;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoAlumno;
    private Set <Curso> listaDeCursos;

    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
        listaDeCursos = new HashSet<>();
    }

    public void agregarCursoAlAlumno(Curso unCurso){
        listaDeCursos.add(unCurso);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno;
    }

    public Set<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno){
            return ((Alumno) obj).getCodigoAlumno().equals(this.codigoAlumno);
        }
        return false;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " apellido: " + apellido + " codigo: " + codigoAlumno;
    }
}
