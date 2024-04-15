package com.albani.producto.model.entities;

public class Profesor extends Persona{              //Heredan nombre, apellido y edad

    private String materia;     //Atributo

    private Float experiencia; //Atributo

    //Constructor
    public Profesor(String nombre, String apellido, Float edad, String materia, Float experiencia) {
        super(nombre, apellido, edad);
        this.materia = materia;
        this.experiencia = experiencia;
    }


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Float experiencia) {
        this.experiencia = experiencia;
    }

    //METODOS

    public void explicar(){
        System.out.printf(getNombre()+"Estoy explicando.");
    }

    public void anotarPizzarron(){
        System.out.printf(getNombre()+"Estoy anotando en el pizzarron");
    }

}
