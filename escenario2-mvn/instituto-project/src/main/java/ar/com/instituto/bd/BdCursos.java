package ar.com.instituto.bd;

import ar.com.instituto.domain.Curso;
import ar.com.instituto.enumeration.ComplejidadEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BdCursos {

    private static List<Curso> cursoList;

    public static List<Curso> getCursoList() {
        List<Curso> cursoList = new ArrayList<>();

        cursoList.add(new Curso(UUID.randomUUID(), "Programación Orientada a Objetos", 100, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Algoritmos y Estructuras de Datos", 80, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Desarrollo Web", 120, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Bases de Datos", 90, ComplejidadEnum.BAJA));
        cursoList.add(new Curso(UUID.randomUUID(), "Redes de Computadoras", 70, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Inteligencia Artificial", 150, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Ciberseguridad", 110, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Desarrollo Móvil", 130, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Sistemas Operativos", 100, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Ingeniería de Software", 140, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Programación Funcional", 80, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Machine Learning", 160, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Desarrollo de Videojuegos", 150, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Metodologías Ágiles", 60, ComplejidadEnum.BAJA));
        cursoList.add(new Curso(UUID.randomUUID(), "Análisis de Datos", 110, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Computación en la Nube", 100, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Programación en Python", 90, ComplejidadEnum.BAJA));
        cursoList.add(new Curso(UUID.randomUUID(), "Desarrollo de APIs", 120, ComplejidadEnum.MEDIA));
        cursoList.add(new Curso(UUID.randomUUID(), "Big Data", 140, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "Blockchain", 130, ComplejidadEnum.ALTA));
        cursoList.add(new Curso(UUID.randomUUID(), "UX/UI Design", 80, ComplejidadEnum.BAJA));

        return cursoList;
    }


}
