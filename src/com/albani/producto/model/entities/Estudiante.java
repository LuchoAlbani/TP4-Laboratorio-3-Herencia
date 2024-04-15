package com.albani.producto.model.entities;



public class Estudiante extends Persona{           //Hereda nombre, apellido y edad

    private String carrera; //Atributo

    private Integer matricula;  //Atributo

    private static Integer ultimaMatricula = 0; //debe ser static sino no se autoincrementa cada vez que se crea un nuevo estudiante

    //Constructor
    public Estudiante(String nombre, String apellido, Float edad, String carrera) {
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.matricula = ++ultimaMatricula; //Incrementa y asigna mi matricula
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getMatricula() {
        return matricula;
    }

    //METODOS
    public void estudiar(){
        System.out.printf(getNombre()+" :Estoy estudiando");
    }

    public void haciendoTarea(){
        System.out.printf(getNombre()+" :Estoy haciendo tarea");
    }


}
