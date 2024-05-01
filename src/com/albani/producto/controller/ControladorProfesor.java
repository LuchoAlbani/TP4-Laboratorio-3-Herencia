package com.albani.producto.controller;


import com.albani.producto.model.entities.Profesor;
import com.albani.producto.model.repository.ProfesorRepository;
import com.albani.producto.view.Consola;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorProfesor {

Scanner scanner = new Scanner(System.in);

 ProfesorRepository profesorRepository;
 Consola viewConsola;

    public ControladorProfesor(ProfesorRepository profesorRepository, Consola viewConsola) {
        this.profesorRepository = profesorRepository;
        this.viewConsola = viewConsola;
    }

    //MENU PROFESOR
    public void menuProfesor(){

        while (true) {

            viewConsola.menuProfesor();

            int opcion = viewConsola.obtenerOpcionMenu();


            switch (opcion){
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    leerProfesor();
                    break;
                case 3:
                    actualizarProfesor();
                    break;
                case 4:
                    eliminarProfesor();
                    break;
                case 5:
                    mostrarListaProfesor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }

        }

    }

    //FUNCIONES

    public void agregarProfesor(){
        Profesor profesor = viewConsola.agregarProfesor();
        profesorRepository.agregarProfesor(profesor);
    }


    public void leerProfesor(){
        Integer legajo = viewConsola.leerProfesor();
        Profesor profesor = profesorRepository.leerProfesor(legajo);

        System.out.println(" "+profesor);
    }

    public void actualizarProfesor(){
        Integer legajo = viewConsola.leerProfesor();
        Profesor profesor = profesorRepository.leerProfesor(legajo);

        if(profesor == null){
            System.out.println("El profesor que busca no existe");
        }else{
            Profesor profesorActualizado = viewConsola.actualizarProfesor(profesor);
            profesorRepository.actualizarProfesor(legajo, profesorActualizado);

        }
    }

    public void eliminarProfesor(){
        Integer legajoEliminar = viewConsola.eliminarProfesor();
        profesorRepository.eliminarProfesor(legajoEliminar);
    }

    public void mostrarListaProfesor(){
        ArrayList<Profesor> listaProfesor = profesorRepository.getListaProfesores();
        viewConsola.mostrarListaProfesor(listaProfesor);
    }


}
