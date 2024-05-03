package com.albani.producto.model.entities;

public class Profesor extends Persona{              //Heredan nombre, apellido y edad

    private String materia;     //Atributo

    private Integer legajo; //Atributo

    private static Integer ultimoLegajo = 0;

    //Constructor
    public Profesor(String nombre, String apellido, Float edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
        this.legajo = ++ultimoLegajo;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getLegajo() {
        return legajo;
    }

    //METODOS

    public void explicar(){
        System.out.printf(getNombre()+"Estoy explicando.");
    }

    public void anotarPizzarron(){
        System.out.printf(getNombre()+"Estoy anotando en el pizzarron");
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "legajo=" + getLegajo() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", materia='" + getMateria() + '\'' +
                '}';
    }

}
