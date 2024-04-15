package com.albani.producto.model.entities;



public class Estudiante extends Persona{           //Hereda nombre, apellido y edad

    private String carrera;

    private Float matricula;


    //Constructor
    public Estudiante(String nombre, String apellido, Float edad, String carrera, Float matricula) {
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Float getMatricula() {
        return matricula;
    }

    public void setMatricula(Float matricula) {
        this.matricula = matricula;
    }

    //METODOS
    public void estudiar(){
        System.out.printf(getNombre()+" :Estoy estudiando");
    }

    public void haciendoTarea(){
        System.out.printf(getNombre()+" :Estoy haciendo tarea");
    }


}
