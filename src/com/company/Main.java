package com.company;

import com.company.Profesor.Profesor;
import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Alumno unAlumno = new Alumno("Pepito", "Suarez", 1);
        Alumno otroAlumno = new Alumno("Juan", "Carlos", 2);
        ProfesorTitular unProfesorTitular = new ProfesorTitular("Oscar", "Pepito", 2, 1, "mat");
        ProfesorAdjunto unProfesorAdjunto = new ProfesorAdjunto("Josefina", "Lala", 4, 8, 10);
        Curso unCurso = new Curso("1A", 2, unProfesorTitular, unProfesorAdjunto, 5);
        unCurso.agregarUnAlumno(unAlumno);
        unCurso.agregarUnAlumno(otroAlumno);
        unCurso.eliminarAlumno(otroAlumno);
    }
}
