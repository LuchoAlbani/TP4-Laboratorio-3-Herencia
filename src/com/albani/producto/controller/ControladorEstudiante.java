package com.albani.producto.controller;

import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.entities.Profesor;
import com.albani.producto.model.repository.EstudianteRepository;

import java.util.ArrayList;


public class ControladorEstudiante {

    EstudianteRepository estudianteRepository;

    public ControladorEstudiante(){
        this.estudianteRepository = new EstudianteRepository();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudianteRepository.agregarEstudiante(estudiante);
    }

    public Estudiante leerEstudiante(Integer matricula){
        return estudianteRepository.leerEstudiante(matricula);  //asume que estudianteRepository.leerEstudiante(matricula);
                                                                //devuelve un objeto Estudiante. Si no se encuentra ningún estudiante con
                                                                //la matrícula dada, esta función debería devolver null.

    }

    public void actualizarEstudiante(Integer matricula, Estudiante estudiante){
        estudianteRepository.actualizarEstudiante(matricula, estudiante);
    }

    public void eliminarEstudiante(Integer matricula){
        estudianteRepository.eliminarEstudiante(matricula);
    }

    public ArrayList<Estudiante> obtenerListaEstudiantes(){
        return estudianteRepository.getListaEstudiantes();
    }


}
