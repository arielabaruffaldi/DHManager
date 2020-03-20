package com.company;

import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Integer codigoCurso;
    private ProfesorTitular unProfesorTitular;
    private ProfesorAdjunto unProfesorAdjunto;
    private Integer cupoMaximoAlumnos;
    private List<Alumno> unaListaDeAlumno;

    public Curso(String nombre, Integer codigoCurso, ProfesorTitular unProfesorTitular,
                 ProfesorAdjunto unProfesorAdjunto, Integer cupoMaximoAlumnos, List<Alumno> unaListaDeAlumno) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
        this.unProfesorTitular = unProfesorTitular;
        this.unProfesorAdjunto = unProfesorAdjunto;
        this.cupoMaximoAlumnos = cupoMaximoAlumnos;
        this.unaListaDeAlumno = new ArrayList<>();
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

    public List<Alumno> getUnaListaDeAlumno() {
        return unaListaDeAlumno;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Curso){
            return ((Curso) obj).getCodigoCurso().equals(this.codigoCurso);
        }
        return false;
    }
}
