package com.albani.producto.model.repository;

import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.entities.Profesor;

import java.util.ArrayList;

public class ProfesorRepository{

    ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

    //Agregar Profesor a la lista
    public void agregarProfesor(Profesor profesor){

        listaProfesores.add(profesor);

    }

    //Funcion Leer Profesor
    public void leerProfesor(Integer legajo) {

        boolean profesorEncontrado = false;

        for (int i = 0; i < listaProfesores.size(); i++) {
            profesorEncontrado = true;
            if (listaProfesores.get(i).getLegajo().equals(legajo)) {
                System.out.println(""+listaProfesores.get(i)); //Imprimo todos los datos del profesor
                return;
            }
        }
        if(!profesorEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }

    }

    //Funcion actualizar Profesor
    public void actualizarProfesor(Integer legajo, Profesor profesorActualizado){

        boolean profesorEncontrado = false;

        for(int i=0; i<listaProfesores.size(); i++){

            if (listaProfesores.get(i).getLegajo().equals(legajo)){
                profesorEncontrado = true;
                listaProfesores.set(i, profesorActualizado); //Toma dos elementos el índice del elemento que quieres reemplazar y el nuevo elemento.
                return;
            }
        }
        if(!profesorEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }
    }

    public void eliminarProfesor(Integer legajo){

        boolean profesorEncontrado = false;

        for (int i=0; i<listaProfesores.size(); i++){
            if (listaProfesores.get(i).getLegajo().equals(legajo)){
                profesorEncontrado = true;

                listaProfesores.remove(i);
                return;
            }
        }
        if (!profesorEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }
    }




}

