package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Alumno unAlumno = new Alumno("Pepito", "Suarez", 1);
        Alumno unAlumno2 = new Alumno("Juan", "Carlos", 1);

        System.out.println(unAlumno.equals(unAlumno2));
    }
}
