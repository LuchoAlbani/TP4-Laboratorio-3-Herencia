package com.albani.producto.view;

import java.util.Scanner;

public class Consola {  //Interactua con el usuario

    Menu menu = new Menu();
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
                    menu.menuProfesor();
                    break;

                case 2:
                    menu.menuEstudiante();
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
}
