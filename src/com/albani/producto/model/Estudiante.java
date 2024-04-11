package com.albani.producto.model;

public class Estudiante extends Persona{

    public Estudiante(String nombre, String apellido, Float edad) {
        super(nombre, apellido, edad);
    }

    public void saludar(){
        System.out.println("La estudiante:"+getNombre()+"Saluda: ¡Hola!");
    }

}
