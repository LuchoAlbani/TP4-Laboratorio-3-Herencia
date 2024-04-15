package com.albani.producto.view;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcion;

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


}
