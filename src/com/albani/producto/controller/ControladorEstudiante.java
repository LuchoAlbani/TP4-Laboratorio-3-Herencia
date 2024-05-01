package com.albani.producto.controller;

import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.repository.EstudianteRepository;
import com.albani.producto.view.Consola;

import java.util.ArrayList;
import java.util.Scanner;


public class ControladorEstudiante {

    Scanner scanner = new Scanner(System.in);

    //LLamo a mi Repository y View
    EstudianteRepository estudianteRepository;
    Consola viewConsola;
    ControladorProfesor controladorProfesor;

    public ControladorEstudiante(EstudianteRepository estudianteRepository, Consola viewConsola, ControladorProfesor controladorProfesor) {
        this.estudianteRepository = estudianteRepository;
        this.viewConsola = viewConsola;
        this.controladorProfesor = controladorProfesor;
    }

    //MENUS

    public void menuPrincipal(){
        while (true) {

            viewConsola.MenuPrincipal();
            int opcion = viewConsola.obtenerOpcionMenu();

            switch (opcion){
                case 1:
                    menuEstudiante();
                    break;
                case 2:
                    controladorProfesor.menuProfesor();
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }

        }

    }

    public void menuEstudiante(){

        while (true) {

            viewConsola.menuEstudiante();

            int opcion = viewConsola.obtenerOpcionMenu();


            switch (opcion){

                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    leerEstudiante();
                    break;
                case 3:
                    actualizarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    mostrarListaEstudiantes();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }

        }

    }

    //FUNCIONES
    public void agregarEstudiante(){
        Estudiante estudiante = viewConsola.agregarEstudiante();
        estudianteRepository.agregarEstudiante(estudiante);

    }

    public void leerEstudiante(){
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

    public void mostrarListaEstudiantes(){
      ArrayList<Estudiante> listaEstudiantes = estudianteRepository.getListaEstudiantes();
      viewConsola.mostrarListaEstudiantes(listaEstudiantes);

    }





}
