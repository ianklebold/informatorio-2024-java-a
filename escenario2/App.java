package escenario2;

import escenario2.dominio.Institucion;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese opcion : \n");
            System.out.println("1. Crear curso");
            System.out.println("2. Registrar estudiante nuevo");
            System.out.println("3. Registrar a un curso a partir de un estudiante existente");
            System.out.println("4. Listar cursos");
            System.out.println("5. Listar cursos y estudiantes");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    institucion.crearCurso();
                    break;
                case 2:
                    System.out.println("Ingrese id de curso");
                    String idCurso = scanner.nextLine();
                    scanner.nextLine();
                    institucion.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3:
                    //Funcionalidad registrar un estudiante existente
                    System.out.println("Ingrese id de curso");
                    idCurso = scanner.nextLine();
                    System.out.println("Ingrese dni de estudiante");
                    Long dniEstudiante = scanner.nextLong();
                    scanner.nextLine();
                    try{
                        institucion.inscribirEstudianteACurso(UUID.fromString(idCurso), dniEstudiante);
                    }catch (NoSuchElementException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    institucion.listarCursos();
                    break;
                case 5:
                    institucion.listarEstudiantesYCursos();
                    break;
                case 6:
                    System.out.println("\n Aplicacion finalizada");
                    break;
                default:
                    break;
            }

        }while (opcion != 6);



        scanner.close();
    }
}
