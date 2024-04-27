package com.albani.producto.view;

import com.albani.producto.model.entities.Estudiante;


import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

    Scanner scanner = new Scanner(System.in);

    int opcion;

    public void consola() {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("BIENVENIDO AL MENU PRINCIPAL");
            System.out.println("1.Menu Profesor");
            System.out.println("2.Menu Estudiante");
            System.out.println("0.Salir");
            System.out.printf("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    //menuProfesor();
                    break;

                case 2:
                    menuEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");


            }


        }

    }

    public void menuProfesor() {

        System.out.println("");
        System.out.println("MENU PROFESOR");
        System.out.println("1.Agregar Profesor");
        System.out.println("2.Leer Profesor");
        System.out.println("3.Actualizar Profesor");
        System.out.println("4.Eliminar Profesor");
        System.out.println("5.Mostrar toda la Lista de Profesores");
        System.out.println("0.Salir");
        System.out.printf("Opcion: ");
        while (true) {

            opcion = scanner.nextInt();

            switch (opcion){

                case 1:
                    //agregarProfesor();
                    break;
                case 2:
                    //leerProfesor();
                    break;
                case 3:
                   // actualizarProfesor();
                    break;
                case 4:
                   // eliminarProfesor();
                    break;
                case 5:
                   // mostrarListaProfesor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }
        }
    }

    public void menuEstudiante(){

        System.out.println("");
        System.out.println("MENU ESTUDIANTE");
        System.out.println("1.Agregar Estudiante");
        System.out.println("2.Leer Estudiante");
        System.out.println("3.Actualizar Estudiante");
        System.out.println("4.Eliminar Estudiante");
        System.out.println("5.Mostrar toda la Lista de Estudiantes");
        System.out.println("0.Salir");
        System.out.printf("Opcion: ");

        while (true) {

            opcion = scanner.nextInt();
            scanner.nextLine();

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

                    break;
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }
        }

    }

    //FUNCIONES ESTUDIANTE

    //FUNCION AGREGAR ESTUDIANTE
    public Estudiante agregarEstudiante() { //Paso por parametro la lista de estudiante

        System.out.println("Ingresar los datos del estudiante");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Edad: ");
        Float edad = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("Nuevo estudiante creado con exito");

        return new Estudiante(nombre, apellido, edad, carrera);

    }

    //FUNCION LEER ESTUDIANTE
    public Integer leerEstudiante(){

        System.out.println("Ingrese la Matricula del estudiante que desea ver: ");
        Integer matricula = scanner.nextInt();
        scanner.nextLine();

        return matricula;

    }


    //FUNCION ACTUALIZAR ESTUDIANTE
    public Estudiante actualizarEstudiante(Estudiante estudiante){

                System.out.println("");
                System.out.println("Datos del usuario que desea modificar");
                System.out.println(" Nombre: "+estudiante.getNombre()+" Apellido: "+estudiante.getApellido()+" Edad: "+estudiante.getEdad()+" Carrera: "+estudiante.getCarrera());

                System.out.println("Desea cambiar el nombre? (si/no)");
                String opcion = scanner.nextLine();
                if (opcion.equals("si")){
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    estudiante.setNombre(nombre);
                }

                System.out.println("Desea cambiar el apellido? (si/no)");
                opcion = scanner.nextLine();
                if (opcion.equals("si")){
                    System.out.println("Apellido: ");
                    String apellido = scanner.nextLine();
                    estudiante.setApellido(apellido);

                }

                System.out.println("Desea cambiar edad? (si/no)");
                opcion = scanner.nextLine();
                if (opcion.equals("si")){
                    System.out.println("Edad: ");
                    Float edad = scanner.nextFloat();
                    scanner.nextLine();
                    estudiante.setEdad(edad);

                }

                System.out.println("Desea cambiar la carrera?(si/no)");
                opcion = scanner.nextLine();
                if (opcion.equals("si")){
                    System.out.println("Carrera: ");
                    String carrera = scanner.nextLine();
                    estudiante.setCarrera(carrera);

                }

                return estudiante;

    }


    //FUNCION ELIMINAR ESTUDIANTE
    public Integer eliminarEstudiante(){

        System.out.println("Ingrese la matricula del estudiante a eliminar");
        Integer matriculaEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        return matriculaEliminar;

    }




    //FUNCIONES PROFESOR
    //FUNCION AGREGAR PROFESOR
    /*
    public void agregarProfesor() { //Paso por parametro la lista de Profesores

        System.out.println("Ingresar los datos del profesor");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Edad: ");
        Float edad = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Materia: ");
        String materia = scanner.nextLine();


        controladorProfesor.agregarProfesor(new Profesor(nombre, apellido, edad, materia));

    }


    //FUNCION LEER PROFESOR
    public void leerProfesor(){

        System.out.println("Ingrese el Legajo del profesor que desea ver: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        controladorProfesor.leerProfesor(legajo);

    }


    //FUNCION MOSTRAR LISTA PROFESORES
    public void mostrarListaProfesor(){
        ArrayList<Profesor> listaProfesor = controladorProfesor.obtenerListaProfesores();
        for (Profesor profesor : listaProfesor){ // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Legajo|: "+profesor.getLegajo()+" |Nombre|: "+profesor.getNombre()+" |Apellido|: "+profesor.getApellido()+" |Edad|: "+profesor.getEdad()+" |Materia| "+profesor.getMateria());
        }

    }


    //FUNCION ACTUALIZAR PROFESOR
    public void actualizarProfesor(){
        System.out.println("Ingrese el legajo del profesor que desea modificar: ");
        Integer legajo = scanner.nextInt();
        scanner.nextLine();

        Profesor profesor = controladorProfesor.leerProfesor(legajo);    //LLamo a la funcion leer profesor para buscarlo
        if(profesor == null){
            System.out.println("El profesor que esta buscando no existe");
            return;
        }

        System.out.println("");
        System.out.println("Datos del usuario que desea modificar");
        System.out.println(" Nombre: "+profesor.getNombre()+" Apellido: "+profesor.getApellido()+" Edad: "+profesor.getEdad()+" Materia: "+profesor.getMateria());

        System.out.println("Desea cambiar el nombre? (si/no)");
        String opcion = scanner.nextLine();
        if (opcion.equals("si")){
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            profesor.setNombre(nombre);
        }

        System.out.println("Desea cambiar el apellido? (si/no)");
        opcion = scanner.nextLine();
        if (opcion.equals("si")){
            System.out.println("Apellido: ");
            String apellido = scanner.nextLine();
            profesor.setApellido(apellido);

        }

        System.out.println("Desea cambiar edad? (si/no)");
        opcion = scanner.nextLine();
        if (opcion.equals("si")){
            System.out.println("Edad: ");
            Float edad = scanner.nextFloat();
            scanner.nextLine();
            profesor.setEdad(edad);

        }

        System.out.println("Desea cambiar la materia?(si/no)");
        opcion = scanner.nextLine();
        if (opcion.equals("si")){
            System.out.println("Carrera: ");
            String materia = scanner.nextLine();
            profesor.setMateria(materia);

        }

        controladorProfesor.actualizarProfesor(legajo, profesor);

    }

    //FUNCION ELIMINAR PROFESOR
    public void eliminarProfesor(){

        System.out.println("Ingrese el legajo del profesor a eliminar");
        Integer legajoEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        controladorProfesor.eliminarProfesor(legajoEliminar);

    }
    */

}
