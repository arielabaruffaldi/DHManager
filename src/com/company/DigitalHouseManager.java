package com.company;

import com.company.Profesor.Profesor;
import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

import java.util.*;

public class DigitalHouseManager {
    private Set<Alumno> listaDeAlumnos;
    private Set<Profesor> listaDeProfesores;
    private Set<Curso> listaDeCursos;
    private Set<Inscripcion> listaDeInscripciones;

    public DigitalHouseManager() {
        listaDeAlumnos = new HashSet<>();
        listaDeProfesores = new HashSet<>();
        listaDeCursos = new HashSet<>();
        listaDeInscripciones = new HashSet<>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);
        listaDeCursos.add(unCurso);
        //System.out.println("se dio de alta el curso " + unCurso);
    }

    public void bajaCurso(Integer codigoCurso) {
        Curso cursoEliminar = buscarCurso(codigoCurso);
        if (cursoEliminar != null) {
            listaDeCursos.remove(cursoEliminar);
        } else {
            System.out.println("no se encuentra el codigo de curso");
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        Profesor unProfesorAdjunto = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
        listaDeProfesores.add(unProfesorAdjunto);
        //System.out.println("se dio de alta el profesor adjunto " + unProfesorAdjunto.getNombre());

    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        Profesor unProfesorTitular = new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad);
        listaDeProfesores.add(unProfesorTitular);
        //System.out.println("se dio de alta el profesor titular " + unProfesorTitular.getNombre());

    }

    public void bajaProfesor(Integer codigoProfesor) {
        Profesor profesorAEliminar = buscarProfesor(codigoProfesor);
        listaDeProfesores.remove(profesorAEliminar);
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno) {
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        listaDeAlumnos.add(unAlumno);
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso) {
        Curso cursoAInscribir = buscarCurso(codigoCurso);
        Alumno alumnoAInscribir = buscarAlumno(codigoAlumno);
        //se fija si existe el curso, el alumno y si hay cupo suficiente
        if (cursoAInscribir != null && alumnoAInscribir != null && cursoAInscribir.agregarUnAlumno(alumnoAInscribir)) {
            Inscripcion unaInscripcion = new Inscripcion(alumnoAInscribir, cursoAInscribir);
            listaDeInscripciones.add(unaInscripcion);
            cursoAInscribir.agregarUnAlumno(alumnoAInscribir);
        } else {
            System.out.println("no se puede a: + "+ alumnoAInscribir +"inscribir porque no hay cupo");

        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto) {
        ProfesorAdjunto profesorAdjuntoAsignar = (ProfesorAdjunto) buscarProfesor(codigoProfesorAdjunto);
        ProfesorTitular profesorTitularAsignar = (ProfesorTitular) buscarProfesor(codigoProfesorTitular);
        Curso cursoAsignar = buscarCurso(codigoCurso);
        if (cursoAsignar != null && profesorAdjuntoAsignar != null && profesorTitularAsignar != null) {
            cursoAsignar.setUnProfesorAdjunto(profesorAdjuntoAsignar);
            cursoAsignar.setUnProfesorTitular(profesorTitularAsignar);
        } else {
            System.out.println("no se pudo asignar los profesores");
        }
    }

    public Curso buscarCurso(Integer codigoCurso) {
        Curso cursoBuscado = null;
        for (Curso unCurso : listaDeCursos) {
            if (unCurso.getCodigoCurso().equals(codigoCurso)) {
                cursoBuscado = unCurso;
                break;
            }
        }
        return cursoBuscado;
    }

    public Alumno buscarAlumno(Integer codigoAlumno) {
        Alumno alumnoBuscado = null;
        for (Alumno unAlumno : listaDeAlumnos) {
            if (unAlumno.getCodigoAlumno().equals(codigoAlumno)) {
                alumnoBuscado = unAlumno;
            }
        }
        return alumnoBuscado;
    }

    public Profesor buscarProfesor(Integer codigoProfesor) {
        Profesor profesorBuscado = null;
        for (Profesor unProfesor : listaDeProfesores) {
            if (unProfesor.getCodigoProfesor().equals(codigoProfesor)) {
                profesorBuscado = unProfesor;
            }
        }
        return profesorBuscado;
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

    @Override
    public String toString() {
        return "DigitalHouseManager{" +
                "listaDeAlumnos=" + listaDeAlumnos +
                ", listaDeProfesores=" + listaDeProfesores +
                ", listaDeCursos=" + listaDeCursos +
                ", listaDeInscripciones=" + listaDeInscripciones +
                '}';
    }
}
