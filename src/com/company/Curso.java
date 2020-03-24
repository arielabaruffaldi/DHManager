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
    private Set<Alumno> unaListaDeAlumno = new HashSet<>();

    public Curso(String nombre, Integer codigoCurso, ProfesorTitular unProfesorTitular,
                 ProfesorAdjunto unProfesorAdjunto, Integer cupoMaximoAlumnos) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.unProfesorTitular = unProfesorTitular;
        this.unProfesorAdjunto = unProfesorAdjunto;
        this.cupoMaximoAlumnos = cupoMaximoAlumnos;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if(unaListaDeAlumno.size() < cupoMaximoAlumnos){
            unaListaDeAlumno.add(unAlumno);
            return true;
        }
        return false;
    }

    public void eliminarAlumno(Alumno unAlumno){
        if(unaListaDeAlumno.size()>0){
            unaListaDeAlumno.remove(unAlumno);
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

    public Set<Alumno> getUnaListaDeAlumno() {
        return unaListaDeAlumno;
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
                ", unaListaDeAlumno=" + unaListaDeAlumno +
                '}';
    }
}
