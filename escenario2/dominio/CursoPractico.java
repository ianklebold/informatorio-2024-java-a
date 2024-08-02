package escenario2.dominio;

import java.util.ArrayList;
import java.util.List;

public class CursoPractico extends Curso{
    private List<Recurso> recursos = new ArrayList();

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
}
