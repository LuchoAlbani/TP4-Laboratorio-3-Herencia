package com.albani.producto.view;

import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.entities.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

    Scanner scanner = new Scanner(System.in);

    int opcion;

    public void MenuPrincipal() {
            System.out.println("BIENVENIDO AL MENU PRINCIPAL");
            System.out.println("1.Menu Estudiante");
            System.out.println("2.Menu Profesor");
            System.out.println("0.Salir");

    }

    public void menuProfesor() {
        System.out.println("MENU PROFESOR");
        System.out.println("1.Agregar Profesor");
        System.out.println("2.Leer Profesor");
        System.out.println("3.Actualizar Profesor");
        System.out.println("4.Eliminar Profesor");
        System.out.println("5.Mostrar toda la Lista de Profesores");
        System.out.println("0.Salir");

    }

    public void menuEstudiante(){

        System.out.println("MENU ESTUDIANTE");
        System.out.println("1.Agregar Estudiante");
        System.out.println("2.Leer Estudiante");
        System.out.println("3.Actualizar Estudiante");
        System.out.println("4.Eliminar Estudiante");
        System.out.println("5.Mostrar toda la Lista de Estudiantes");
        System.out.println("0.Salir");


    }

    public int obtenerOpcionMenu() {
        // Se obtiene la opción del menú que el usuario desea seleccionar
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;

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

    //FUNCION MOSTRAR LISTA ESTUDIANTES
    public void mostrarListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        for (Estudiante estudiante : listaEstudiantes) { // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Matricula|: " + estudiante.getMatricula() + " |Nombre|: " + estudiante.getNombre() + " |Apellido|: " + estudiante.getApellido() + " |Edad|: " + estudiante.getEdad() + " |Carrera| " + estudiante.getCarrera());
        }
    }

    //FUNCIONES PROFESOR
    //FUNCION AGREGAR PROFESOR

    public Profesor agregarProfesor() { //Paso por parametro la lista de Profesores

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

        System.out.println("Nuevo Profesor creado con exito");

        return new Profesor(nombre, apellido, edad, materia);

    }


    //FUNCION LEER PROFESOR
    public Integer leerProfesor(){

        System.out.println("Ingrese el Legajo del profesor que desea ver: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        return legajo;

    }


    //FUNCION ACTUALIZAR PROFESOR
    public Profesor actualizarProfesor(Profesor profesor){

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

        return profesor;

    }

    //FUNCION ELIMINAR PROFESOR
    public Integer eliminarProfesor(){

        System.out.println("Ingrese el legajo del profesor a eliminar");
        Integer legajoEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        return legajoEliminar;

    }

    //FUNCION MOSTRAR LISTA PROFESORES
    public void mostrarListaProfesor(ArrayList<Profesor> listaProfesor){
        for (Profesor profesor : listaProfesor){ // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Legajo|: "+profesor.getLegajo()+" |Nombre|: "+profesor.getNombre()+" |Apellido|: "+profesor.getApellido()+" |Edad|: "+profesor.getEdad()+" |Materia| "+profesor.getMateria());
        }

    }


}
