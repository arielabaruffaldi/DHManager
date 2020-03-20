package com.company;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoAlumno;

    public Alumno(String nombre, String apellido, Integer codigoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAlumno = codigoAlumno;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno){
            Alumno objAComparar = (Alumno) obj;
            return objAComparar.getCodigoAlumno().equals(this.codigoAlumno);
        }
        return false;
    }
}
