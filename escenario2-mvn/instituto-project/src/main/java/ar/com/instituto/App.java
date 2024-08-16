package ar.com.instituto;

import ar.com.instituto.domain.Institucion;
import ar.com.instituto.service.archivos.ArchivosCursosService;
import ar.com.instituto.service.archivos.impl.ArchivosCursosServiceImpl;
import ar.com.instituto.service.curso.CursoService;
import ar.com.instituto.service.curso.impl.CursoServiceImpl;
import ar.com.instituto.service.estudiante.EstudianteService;
import ar.com.instituto.service.estudiante.impl.EstudianteServiceImpl;
import ar.com.instituto.service.institucion.InstitucionService;
import ar.com.instituto.service.institucion.impl.InstitucionServiceImpl;
import ar.com.instituto.service.menu.MenuService;
import ar.com.instituto.service.menu.impl.MenuServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Institucion institucion = new Institucion();
        EstudianteService estudianteService = new EstudianteServiceImpl();
        InstitucionService institucionService = new InstitucionServiceImpl(institucion);
        ArchivosCursosService archivosCursosService = new ArchivosCursosServiceImpl();

        CursoService cursoService = new CursoServiceImpl(estudianteService, institucionService);
        MenuService menuService = new MenuServiceImpl(cursoService, archivosCursosService);
        Scanner scanner = new Scanner(System.in);

        menuService.mostrarMenu(scanner);

        scanner.close();
        archivosCursosService.cerrarWriter();
    }
}
