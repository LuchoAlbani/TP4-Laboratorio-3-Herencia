package com.albani.producto.model.entities;

public class Profesor extends Persona{              //Heredan nombre, apellido y edad

    private String materia;     //Atributo

    private Integer legajo; //Atributo

    private static Integer ultimoLegajo;

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

}
