package escenario2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private List<Curso> cursos = new ArrayList();


    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
