package com.albani.producto.controller;


import com.albani.producto.model.entities.Profesor;
import com.albani.producto.model.repository.ProfesorRepository;
import com.albani.producto.view.Consola;

import java.util.Scanner;

public class ControladorProfesor {

    Scanner scanner = new Scanner(System.in);

 ProfesorRepository profesorRepository;
 Consola viewConsola;

    public ControladorProfesor(ProfesorRepository profesorRepository, Consola viewConsola) {
        this.profesorRepository = profesorRepository;
        this.viewConsola = viewConsola;
    }

    public void agregarProfesor(){
        Profesor profesor = viewConsola.agregarProfesor();
        profesorRepository.agregarProfesor(profesor);
    }




}
