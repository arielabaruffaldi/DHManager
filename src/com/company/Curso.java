package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular unProfesorTitular;
    private ProfesorAdjunto unProfesorAdjunto;
    private Integer cupoMaximoAlumnos;
    private Set<Alumno> unaListaDeAlumnos;

    public Curso(String nombre, Integer codigoCurso, Integer cupoMaximoAlumnos) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.cupoMaximoAlumnos = cupoMaximoAlumnos;
        this.unaListaDeAlumnos =  new HashSet<>();
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if(unaListaDeAlumnos.size() < cupoMaximoAlumnos){
            unaListaDeAlumnos.add(unAlumno);
            return true;
        }
        return false;
    }

    public void eliminarAlumno(Alumno unAlumno){
        if(unaListaDeAlumnos.size()>0){
            unaListaDeAlumnos.remove(unAlumno);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public ProfesorTitular getUnProfesorTitular() {
        return unProfesorTitular;
    }

    public ProfesorAdjunto getUnProfesorAdjunto() {
        return unProfesorAdjunto;
    }

    public Integer getCupoMaximoAlumnos() {
        return cupoMaximoAlumnos;
    }

    public Set<Alumno> getUnaListaDeAlumnos() {
        return unaListaDeAlumnos;
    }

    public void setUnProfesorTitular(ProfesorTitular unProfesorTitular) {
        this.unProfesorTitular = unProfesorTitular;
    }

    public void setUnProfesorAdjunto(ProfesorAdjunto unProfesorAdjunto) {
        this.unProfesorAdjunto = unProfesorAdjunto;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Curso){
            return ((Curso) obj).getCodigoCurso().equals(this.codigoCurso);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", unProfesorTitular=" + unProfesorTitular +
                ", unProfesorAdjunto=" + unProfesorAdjunto +
                ", cupoMaximoAlumnos=" + cupoMaximoAlumnos +
                ", unaListaDeAlumno=" + unaListaDeAlumnos +
                '}';
    }
}
