package ar.com.instituto.service.curso;

import ar.com.instituto.domain.Curso;

import java.util.UUID;

public interface CursoService {
    void inscribirEstudiante(UUID idCurso);

    Curso crearCurso();

    void inscribirEstudianteACurso(UUID idCurso, Long dni);

    void listarCursos();

    void listarEstudiantesYCursos();
}
