package com.albani.producto.model.repository;
import com.albani.producto.model.entities.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfesorRepository {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(); //Creo una Lista de estudiantes,


    //FUNCION AGREGAR PROFESOR
    public void agregarEstudiante(ArrayList<Profesor> listaProfesores) { //Paso por parametro la lista de estudiante

        System.out.println("Ingresar los datos del profesor");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Edad: ");
        Float edad = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Materia: ");
        String materia = scanner.nextLine();

        Profesor nuevoProfesor = new Profesor(nombre, apellido, edad, materia); //Utiliza el constructor de la clase Estudiante para inicializar el nuevo objeto con los valores proporcionados para nombre, apellido, edad y carrera

        listaProfesores.add(nuevoProfesor); // El método add() es parte de la clase ArrayList y se utiliza para agregar elementos al final de la lista.

        System.out.println("Nuevo profesor creado con exito");

    }


    //FUNCION MOSTRAR LISTA PROFESOR
    public void mostrarListaProfesores(ArrayList<Profesor> listaProfesores){
        for (Profesor profesor : listaProfesores){ // ":" signif para cada, almacenara cada elemento indiv de la listaProfesor.
            System.out.println(" |Legajo|: "+profesor.getLegajo()+" |Nombre|: "+profesor.getNombre()+" |Apellido|: "+profesor.getApellido()+" |Edad|: "+profesor.getEdad()+" |Materia|: "+profesor.getMateria());
        }
    /*
     recorre la lista de estudiantes uno por uno. En cada paso del recorrido,
     toma un estudiante de la lista y lo guardas en la variable estudiante.
     Luego, dentro del bucle, puedes usar esa variable para referirte al estudiante que estás manejando en ese momento.
     Una vez que terminas de hacer lo que necesitas con ese estudiante,
     pasas al siguiente, y así sucesivamente hasta que no queden más estudiantes en la lista.
    */
    }

    //FUNCION ACTUALIZAR PROFESOR
    public void actualizarProfesor(ArrayList<Profesor> listaProfesores){
        System.out.println("Ingrese la matricula del profesor que desea modificar: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();

        boolean profesorEncontrado = false;

        for (Profesor profesor : listaProfesores){ //recorro la lista

            if (profesor.getLegajo().equals(numero)){//si la matricula del estudiante actual es igual al numero que seleccione ahi implemento mi logica para modificar sus datos
                profesorEncontrado = true;
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
                System.out.println("Profesor Actualizado! ✓ ");
                break; //Una vez que termina de actualizar al estudiante finaliza el bucle for.
            }
        }
        if (!profesorEncontrado){
            System.out.println("El profesor con la matricula "+numero+" no existe...");
        }
    }

    //FUNCION ELIMINAR PROFESOR
    public void eliminarProfesor(ArrayList<Profesor> listaProfesores){

        System.out.println("Ingrese la matricula del estudiante a eliminar");
        Integer matriculaEliminar = scanner.nextInt();          //Ingreso el numero de matricula a eliminar
        scanner.nextLine();

        for(Profesor profesor : listaProfesores){      //recorro la lista de estudiantes

            if (profesor.getLegajo().equals(matriculaEliminar)){       //si el numero de matricula es igual a la que deseo eliminar

                System.out.println("El Legajo "+profesor.getLegajo()+" es del profesor |Nombre|: "+profesor.getNombre()+" |Apellido|: "+profesor.getApellido()+" |Edad|: "+profesor.getEdad()+" |Materia|: "+profesor.getMateria());

                System.out.println("Desea eliminarlo de la lista? (si/no)");        //pregunto al usuario si esta seguro que desea eliminarlo

                String opcion = scanner.nextLine();
                if(opcion.equals("si")){        // si confirma, lo remueve de la lista.

                    listaProfesores.remove(profesor); //elimina el estudiante en la posicion encontrada

                }
                break;
            }

        }

    }


}
