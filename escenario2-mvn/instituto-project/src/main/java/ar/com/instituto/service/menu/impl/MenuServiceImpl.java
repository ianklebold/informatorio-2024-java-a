package ar.com.instituto.service.menu.impl;

import ar.com.instituto.bd.BdCursos;
import ar.com.instituto.service.archivos.ArchivosCursosService;
import ar.com.instituto.service.curso.CursoService;
import ar.com.instituto.service.menu.MenuService;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

public class MenuServiceImpl implements MenuService {

    private CursoService cursoService;

    private ArchivosCursosService archivosCursosService;

    public MenuServiceImpl(CursoService cursoService, ArchivosCursosService archivosCursosService) {
        this.cursoService = cursoService;
        this.archivosCursosService = archivosCursosService;
    }

    @Override
    public void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Ingrese opcion : \n");
            System.out.println("1. Crear curso");
            System.out.println("2. Registrar estudiante nuevo");
            System.out.println("3. Registrar a un curso a partir de un estudiante existente");
            System.out.println("4. Listar cursos");
            System.out.println("5. Listar cursos y estudiantes");
            System.out.println("6. Exportar cursos");
            System.out.println("7. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    cursoService.crearCurso();
                    break;
                case 2:
                    System.out.println("Ingrese id de curso");
                    String idCurso = scanner.nextLine();
                    scanner.nextLine();
                    cursoService.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3:
                    //Funcionalidad registrar un estudiante existente
                    System.out.println("Ingrese id de curso");
                    idCurso = scanner.nextLine();
                    System.out.println("Ingrese dni de estudiante");
                    Long dniEstudiante = scanner.nextLong();
                    scanner.nextLine();
                    try{
                        cursoService.inscribirEstudianteACurso(UUID.fromString(idCurso), dniEstudiante);
                    }catch (NoSuchElementException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    cursoService.listarCursos();
                    break;
                case 5:
                    cursoService.listarEstudiantesYCursos();
                    break;
                case 6:
                    //Exportar archivo
                    archivosCursosService.exportarCursosCsv(BdCursos.getCursoList());
                    break;
                case 7:
                    System.out.println("\n Aplicacion finalizada");
                    break;
                default:
                    break;
            }

        }while (opcion != 7);
    }
}
