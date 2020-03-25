package com.company.Profesor;

public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoProfesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String toString() {
        return this.getNombre() + this.getApellido() + this.getCodigoProfesor();
    }
}
