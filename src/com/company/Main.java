package com.company;

import com.company.Profesor.Profesor;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Alumno unAlumno = new Alumno("Pepito", "Suarez", 1);
        Alumno otroAlumno = new Alumno("Juan", "Carlos", 2);

        Curso unCurso = new Curso ("1B", 1);
        Curso otroCurso = new Curso ("2B", 2);

        Profesor unProfesor = new Profesor("Maria", "Apellidosky", 1, 2);
        Profesor otroProfesor = new Profesor("Jose", "Rodo", 1, 4);

        System.out.println(unProfesor.equals(otroProfesor));
    }
}
