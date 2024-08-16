package ar.com.instituto.service.estudiante.impl;

import ar.com.instituto.domain.Estudiante;
import ar.com.instituto.service.estudiante.EstudianteService;

import java.time.LocalDate;
import java.util.Scanner;

public class EstudianteServiceImpl implements EstudianteService {

    @Override
    public Estudiante registrarEstudiante() {
        Estudiante estudianteNuevo = new Estudiante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        sc.nextLine();
        estudianteNuevo.setNombre(nombreEstudiante);

        System.out.println("Ingrese el dni del estudiante: ");
        Long dni = sc.nextLong();
        estudianteNuevo.setDni(dni);
        sc.nextLine();

        System.out.println("Ingrese el año de nacimiento del estudiante: ");
        int anoDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el mes de nacimiento del estudiante: ");
        int mesDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el dia de nacimiento del estudiante: ");
        int diaDeNacimiento = sc.nextInt();
        sc.nextLine();

        LocalDate fechaDeNacimiento = LocalDate.of(anoDeNacimiento,mesDeNacimiento,diaDeNacimiento);
        estudianteNuevo.setFechaNacimiento(fechaDeNacimiento);

        return estudianteNuevo;
    }

}
