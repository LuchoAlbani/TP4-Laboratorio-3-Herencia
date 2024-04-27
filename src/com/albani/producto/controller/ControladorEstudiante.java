package com.albani.producto.controller;

import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.repository.EstudianteRepository;
import com.albani.producto.view.Consola;

public class ControladorEstudiante {

    //LLamo a mi Repository y View

    EstudianteRepository estudianteRepository;
    Consola viewConsola;

    public ControladorEstudiante(EstudianteRepository estudianteRepository, Consola viewConsola) {
        this.estudianteRepository = estudianteRepository;
        this.viewConsola = viewConsola;
    }

    //Funciones repository y view

    public void agregarEstudiante(){
        Estudiante estudiante = viewConsola.agregarEstudiante();
        estudianteRepository.agregarEstudiante(estudiante);

    }

    public void LeerEstudiante(){
        Integer matricula = viewConsola.leerEstudiante();
        Estudiante estudiante = estudianteRepository.leerEstudiante(matricula);

        System.out.println("El estudiante buscado es: "+estudiante);
    }

    public void actualizarEstudiante(){
        Integer matricula = viewConsola.leerEstudiante();
        Estudiante estudiante = estudianteRepository.leerEstudiante(matricula);

        if(estudiante!=null) {
            Estudiante estudianteActualizado = viewConsola.actualizarEstudiante(estudiante);
            estudianteRepository.actualizarEstudiante(matricula, estudianteActualizado);
        }else{
            System.out.println("Estudiante no encontrado");
        }

    }

    public void eliminarEstudiante(){
        Integer matriculaEliminar = viewConsola.eliminarEstudiante();
        estudianteRepository.eliminarEstudiante(matriculaEliminar);
    }


}
