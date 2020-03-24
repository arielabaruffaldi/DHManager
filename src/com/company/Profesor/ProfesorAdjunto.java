package com.company.Profesor;

public class ProfesorAdjunto extends Profesor{
    private Integer cantidadHorasConsultas;

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor, Integer cantidadHorasConsultas) {
        super(nombre, apellido, antiguedad, codigoProfesor);
        this.cantidadHorasConsultas = cantidadHorasConsultas;
    }

    public Integer getCantidadHorasConsultas() {
        return cantidadHorasConsultas;
    }

    public void setCantidadHorasConsultas(Integer cantidadHorasConsultas) {
        this.cantidadHorasConsultas = cantidadHorasConsultas;
    }

    @Override
    public String toString() {
        return "ProfesorAdjunto{" +
                "cantidadHorasConsultas=" + cantidadHorasConsultas +
                '}';
    }
}
