package com.company;

public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoProfesor;

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public Integer getAntiguedad() {
        return antiguedad;
    }


    public Integer getCodigoProfesor() {
        return codigoProfesor;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Profesor){
            return ((Profesor) obj).getCodigoProfesor().equals(this.codigoProfesor);
        }
        return false;
    }
}
