package com.albani.producto.view;

import com.albani.producto.controller.ControladorEstudiante;
import com.albani.producto.model.entities.Estudiante;


import java.util.ArrayList;
import java.util.Scanner;

public class Consola {

    ControladorEstudiante controladorEstudiante;

    public Consola() {
        this.controladorEstudiante = new ControladorEstudiante();
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    return;
                default:
                    System.out.println("La opcion seleccionada es incorrecta... vuelva a intentar");

            }
        }

    }

    //FUNCIONES

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

    //FUNCION MOSTRAR LISTA ESTUDIANTE
    public void mostrarListaEstudiante(ArrayList<Estudiante> listaEstudiantes){
        for (Estudiante estudiante : listaEstudiantes){ // ":" signif para cada, almacenara cada elemento indiv de la listaEstud.
            System.out.println(" |Matricula|: "+estudiante.getMatricula()+" |Nombre|: "+estudiante.getNombre()+" |Apellido|: "+estudiante.getApellido()+" |Edad|: "+estudiante.getEdad()+" |Carrera| "+estudiante.getCarrera());
        }
    /*
     recorre la lista de estudiantes uno por uno. En cada paso del recorrido,
     toma un estudiante de la lista y lo guardas en la variable estudiante.
     Luego, dentro del bucle, puedes usar esa variable para referirte al estudiante que estás manejando en ese momento.
     Una vez que terminas de hacer lo que necesitas con ese estudiante,
     pasas al siguiente, y así sucesivamente hasta que no queden más estudiantes en la lista.
    */
    }

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


}
