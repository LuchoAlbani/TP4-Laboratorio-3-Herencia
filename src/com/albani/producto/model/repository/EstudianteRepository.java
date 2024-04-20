package com.albani.producto.model.repository;

import com.albani.producto.model.entities.Estudiante;

import java.util.ArrayList;

public class EstudianteRepository {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    //Agregar estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante){

        listaEstudiantes.add(estudiante);

    }

    //Funcion Leer estudiante
    public void leerEstudiante(Integer matricula) {

        boolean estudianteEncontrado = false;

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            estudianteEncontrado = true;
            if (listaEstudiantes.get(i).getMatricula().equals(matricula)) {
                System.out.println(""+listaEstudiantes.get(i)); //Imprimo todos los datos del alumno
                return;
            }
        }
        if(!estudianteEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }

    }

    //Funcion actualizar estudiante
    public void actualizarEstudiante(Integer matricula, Estudiante estudianteActualizado){

        boolean estudianteEncontrado = false;

        for(int i=0; i<listaEstudiantes.size(); i++){

            if (listaEstudiantes.get(i).getMatricula().equals(matricula)){
                estudianteEncontrado = true;
                listaEstudiantes.set(i, estudianteActualizado); //Toma dos elementos el índice del elemento que quieres reemplazar y el nuevo elemento.
                return;
            }
        }
        if(!estudianteEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }
    }

    public void eliminarEstudiante(Integer matricula){

        boolean estudianteEncontrado = false;

        for (int i=0; i<listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getMatricula().equals(matricula)){
                estudianteEncontrado = true;

                listaEstudiantes.remove(i);
                return;
            }
        }
        if (!estudianteEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }
    }




}

