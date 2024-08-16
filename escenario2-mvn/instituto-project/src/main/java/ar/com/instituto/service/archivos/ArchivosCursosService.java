package ar.com.instituto.service.archivos;

import ar.com.instituto.domain.Curso;

import java.io.IOException;
import java.util.List;

public interface ArchivosCursosService {
    void exportarCursosCsv(List<Curso> cursos);

    void cerrarWriter();
}
