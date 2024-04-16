package com.albani.producto.model.repository;

import com.albani.producto.model.entities.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteRepository {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>(); //Creo una Lista de estudiantes,


    //FUNCION AGREGAR ESTUDIANTE
    public void agregarEstudiante(ArrayList<Estudiante> listaEstudiantes) { //Paso por parametro la lista de estudiante

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

        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad, carrera); //Utiliza el constructor de la clase Estudiante para inicializar el nuevo objeto con los valores proporcionados para nombre, apellido, edad y carrera

        listaEstudiantes.add(nuevoEstudiante); // El método add() es parte de la clase ArrayList y se utiliza para agregar elementos al final de la lista.

        System.out.println("Nuevo estudiante creado con exito");

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
    public void actualizarEstudiante(ArrayList<Estudiante> listaEstudiantes){
        System.out.println("Ingrese la matricula del estudiante que desea modificar: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();

        boolean estudianteEncontrado = false;

        for (Estudiante estudiante : listaEstudiantes){ //recorro la lista

            if (estudiante.getMatricula().equals(numero)){//si la matricula del estudiante actual es igual al numero que seleccione ahi implemento mi logica para modificar sus datos
                estudianteEncontrado = true;
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
                System.out.println("Estudiante Actualizado! 👌");
                break; //Una vez que termina de actualizar al estudiante finaliza el bucle for.
            }
        }
        if (!estudianteEncontrado){
            System.out.println("El estudiante con la matricula "+numero+" no existe...");
        }
    }

    //FUNCION ELIMINAR ESTUDIANTE
    public void eliminarEstudiante(ArrayList<Estudiante> listaEstudiantes){

        System.out.println("Ingrese la matricula del estudiante a eliminar");
        Integer matriculaEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        for(Estudiante estudiante : listaEstudiantes){      //recorro la lista de estudiantes

            if (estudiante.getMatricula().equals(matriculaEliminar)){       //si el numero de matricula es igual a la que deseo eliminar

                System.out.println("La matricula "+estudiante.getMatricula()+" es del estudiante |Nombre|: "+estudiante.getNombre()+" |Apellido|: "+estudiante.getApellido()+" |Edad|: "+estudiante.getEdad()+" |Carrera|: "+estudiante.getCarrera());

                System.out.println("Desea eliminarlo de la lista? (si/no)");        //pregunto al usuario si esta seguro que desea eliminarlo

                String opcion = scanner.nextLine();
                if(opcion.equals("si")){        // si confirma, lo remueve de la lista.

                    listaEstudiantes.remove(estudiante); //elimina el estudiante en la posicion encontrada

                }
                break;
            }

        }

    }

}