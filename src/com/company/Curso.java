package com.company;

public class Curso {
    private String nombre;
    private Integer codigoCurso;

    public Curso(String nombre, Integer codigoCurso) {
        this.nombre = nombre;
        this.codigoCurso = codigoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Curso){
            Curso cursoAComparar = (Curso) obj;
            return cursoAComparar.getCodigoCurso().equals(this.codigoCurso);
        }
        return false;
    }
}
