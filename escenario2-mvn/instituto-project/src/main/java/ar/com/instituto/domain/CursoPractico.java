package ar.com.instituto.domain;

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
