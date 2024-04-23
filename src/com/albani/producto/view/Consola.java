package com.albani.producto.view;

import com.albani.producto.controller.ControladorEstudiante;
import com.albani.producto.controller.ControladorProfesor;
import com.albani.producto.model.entities.Estudiante;
import com.albani.producto.model.entities.Profesor;

import java.util.Scanner;

public class Consola {

    ControladorEstudiante controladorEstudiante;
    ControladorProfesor controladorProfesor;

    public Consola() {
        this.controladorEstudiante = new ControladorEstudiante();
        this.controladorProfesor = new ControladorProfesor();
    }

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
                    menuProfesor();
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
        System.out.println("0.Salir");
        System.out.printf("Opcion: ");
        while (true) {

            opcion = scanner.nextInt();

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
        System.out.println("0.Salir");
        System.out.printf("Opcion: ");

        while (true) {

            opcion = scanner.nextInt();

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
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }
        }

    }

    //FUNCIONES ESTUDIANTE

    //FUNCION AGREGAR ESTUDIANTE
    public void agregarEstudiante() { //Paso por parametro la lista de estudiante

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

        controladorEstudiante.agregarEstudiante(new Estudiante(nombre, apellido, edad, carrera));

    }

    //FUNCION LEER ESTUDIANTE
    public void leerEstudiante(){

        System.out.println("Ingrese la Matricula del estudiante que desea ver: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        controladorEstudiante.leerEstudiante(matricula);

    }

    /*
    //FUNCION MOSTRAR LISTA ESTUDIANTE
    public void mostrarListaEstudiante(ArrayList<Estudiante> listaEstudiantes){
        for (Estudiante estudiante : listaEstudiantes){ // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Matricula|: "+estudiante.getMatricula()+" |Nombre|: "+estudiante.getNombre()+" |Apellido|: "+estudiante.getApellido()+" |Edad|: "+estudiante.getEdad()+" |Carrera| "+estudiante.getCarrera());
        }

    }
    */

    //FUNCION ACTUALIZAR ESTUDIANTE
    public void actualizarEstudiante(){
        System.out.println("Ingrese la matricula del estudiante que desea modificar: ");
        Integer matricula = scanner.nextInt();
        scanner.nextLine();

        Estudiante estudiante = controladorEstudiante.leerEstudiante(matricula);    //LLamo a la funcion leer estudiante para buscarlo
        if(estudiante == null){
            System.out.println("El estudiante que esta buscando no existe");
            return;
        }

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

                controladorEstudiante.actualizarEstudiante(matricula, estudiante);

    }

    //FUNCION ELIMINAR ESTUDIANTE
    public void eliminarEstudiante(){

        System.out.println("Ingrese la matricula del estudiante a eliminar");
        Integer matriculaEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        controladorEstudiante.eliminarEstudiante(matriculaEliminar);

    }

    //FUNCIONES PROFESOR

    //FUNCION AGREGAR PROFESOR
    public void agregarProfesor() { //Paso por parametro la lista de Profesores

        System.out.println("Ingresar los datos del estudiante");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Edad: ");
        Float edad = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Legajo: ");
        String legajo = scanner.nextLine();

        controladorProfesor.agregarProfesor(new Profesor(nombre, apellido, edad, legajo));

    }

    //FUNCION LEER PROFESOR
    public void leerProfesor(){

        System.out.println("Ingrese el Legajo del profesor que desea ver: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        controladorProfesor.leerProfesor(legajo);

    }
    /*
    //FUNCION MOSTRAR LISTA ESTUDIANTE
    public void mostrarListaEstudiante(ArrayList<Estudiante> listaEstudiantes){
        for (Estudiante estudiante : listaEstudiantes){ // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Matricula|: "+estudiante.getMatricula()+" |Nombre|: "+estudiante.getNombre()+" |Apellido|: "+estudiante.getApellido()+" |Edad|: "+estudiante.getEdad()+" |Carrera| "+estudiante.getCarrera());
        }

    }
    */
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




}
