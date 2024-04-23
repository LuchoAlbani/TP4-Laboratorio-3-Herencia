package com.albani.producto.model.repository;

import com.albani.producto.model.entities.Profesor;

import java.util.ArrayList;

public class ProfesorRepository {

    ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

    //Agregar Profesor a la lista
    public void agregarProfesor(Profesor profesor){

        listaProfesores.add(profesor);

        System.out.println("Nuevo profesor creado con exito");

    }

    //Funcion Leer Profesor
    public Profesor leerProfesor(Integer legajo) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getLegajo().equals(legajo)) {
                return profesor;
            }
        }
        return null;
    }

    //Funcion actualizar estudiante
    public void actualizarProfesor(Integer legajo, Profesor profesorActualizado){

        boolean profesorEncontrado = false;

        for(int i=0; i<listaProfesores.size(); i++){

            if (listaProfesores.get(i).getLegajo().equals(legajo)){

                profesorEncontrado = true;

                listaProfesores.set(i, profesorActualizado); //Toma dos elementos el índice del elemento que quieres reemplazar y el nuevo elemento.

                System.out.println("Profesor Actualizado! ✓ ");

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

                System.out.println("Estudiante eliminado con exito");

                return;
            }
        }
        if (!profesorEncontrado){
            System.out.println("El estudiante que esta buscando no existe");
        }
    }




}

