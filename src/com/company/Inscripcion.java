package com.company;

import java.util.Date;

public class Inscripcion {
    private Alumno unAlumno;
    private Curso unCurso;
    private Date fechaInscripcion;

    public Inscripcion(Alumno unAlumno, Curso unCurso) {
        this.unAlumno = unAlumno;
        this.unCurso = unCurso;
        this.fechaInscripcion = new Date();
    }

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public Curso getUnCurso() {
        return unCurso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }
}
