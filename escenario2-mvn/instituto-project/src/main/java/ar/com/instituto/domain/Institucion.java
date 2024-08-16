package ar.com.instituto.domain;
import java.util.*;

public class Institucion {
    private List<Curso> cursos = new ArrayList();

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
