package com.albani.producto.controller;

import com.albani.producto.model.entities.Profesor;
import com.albani.producto.model.repository.ProfesorRepository;

import java.util.ArrayList;

public class ControladorProfesor {

    ProfesorRepository profesorRepository;

    public ControladorProfesor() {
        this.profesorRepository = new ProfesorRepository();
    }

    public void agregarProfesor(Profesor profesor){
        profesorRepository.agregarProfesor(profesor);
    }

    public Profesor leerProfesor(Integer legajo){
        return profesorRepository.leerProfesor(legajo);
    }

    public void actualizarProfesor(Integer legajo, Profesor profesor){
        profesorRepository.actualizarProfesor(legajo, profesor);
    }

    public void eliminarProfesor(Integer legajo){
        profesorRepository.eliminarProfesor(legajo);
    }

    public ArrayList<Profesor> obtenerListaProfesores(){
        return profesorRepository.getListaProfesores();
    }


}
