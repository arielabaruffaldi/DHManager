package com.company;

import com.company.Profesor.Profesor;
import com.company.Profesor.ProfesorAdjunto;
import com.company.Profesor.ProfesorTitular;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DigitalHouseManager unDigitalHouseManager = new DigitalHouseManager();
        unDigitalHouseManager.altaProfesorTitular("mariano", "otero", 0, "Matematica");
        unDigitalHouseManager.altaProfesorAdjunto("josefina", "echerri", 1, 2);
        unDigitalHouseManager.altaProfesorTitular("evaristo", "pizza", 2, "Lengua");
        unDigitalHouseManager.altaProfesorAdjunto("angeles", "pepe", 3, 10);

        unDigitalHouseManager.altaCurso("Full Stack", 20001, 3);
        unDigitalHouseManager.altaCurso("Android", 20002, 2);

        unDigitalHouseManager.asignarProfesores(20002, 0, 1);
        unDigitalHouseManager.asignarProfesores(20001, 2, 3);


        unDigitalHouseManager.altaAlumno("Pepe", "Suarez", 0);
        unDigitalHouseManager.altaAlumno("Maria", "Pepita", 1);
        unDigitalHouseManager.altaAlumno("Jonathan", "Algo", 2);

        unDigitalHouseManager.inscribirAlumno(0, 20001);
        unDigitalHouseManager.inscribirAlumno(1, 20001);

        unDigitalHouseManager.inscribirAlumno(0, 20002);
        unDigitalHouseManager.inscribirAlumno(1, 20002);
        unDigitalHouseManager.inscribirAlumno(2, 20002);

        unDigitalHouseManager.bajaProfesor(2);

        unDigitalHouseManager.bajaCurso(20002);

        Alumno unAlumno = unDigitalHouseManager.buscarAlumno(0);

        System.out.println(unAlumno.getListaDeCursos());

        //PARTE K: para poder acceder a los cursos de un alumno le agregué el atributo listaDeCursos a la clase Alumno
        // y el método agregarCursoAlAlumno que se ejecuta en el método inscribirAlumno() de DigitalHouseManager,
        // entonces cada vez que se inscribe a un alumno, este agrega un nuevo elemento al conjunto listaDeCursos.

    }
}
