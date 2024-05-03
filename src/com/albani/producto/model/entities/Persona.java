package com.albani.producto.model.entities;

abstract class Persona {

    private String nombre;

    private String apellido;

    private Float edad;

    public void saludar(){
        System.out.println("La persona: "+nombre+ "Saluda: ¡Hola! ");
    }

    @Override
    public String toString() {
        return "Persona{" +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }

    public Persona(String nombre, String apellido, Float edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getEdad() {
        return edad;
    }

    public void setEdad(Float edad) {
        this.edad = edad;
    }
}
