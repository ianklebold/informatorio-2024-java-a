package escenario2.dominio;

import escenario2.enumeration.ComplejidadEnum;

import java.time.LocalDate;
import java.util.*;

public class Institucion {
    private List<Curso> cursos = new ArrayList();

    private Estudiante registrarEstudiante(){
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

    public void inscribirEstudiante(UUID idCurso){
        Estudiante estudiante = registrarEstudiante();
        boolean existeCurso = Boolean.FALSE;

        for (Curso curso : this.cursos) {

            if ( curso.getId().equals(idCurso) ){
                //Encontramos el curso
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(),estudiante);
                existeCurso = Boolean.TRUE;

                break;
            }

        }

        if ( existeCurso ){
            System.out.println("Estudiante asignado al curso");
        }

    }


    public Curso crearCurso(){
        Curso nuevoCurso = new Curso();
        Scanner sc = new Scanner(System.in);

        nuevoCurso.setId( UUID.randomUUID() );

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = sc.nextLine();
        sc.nextLine();
        nuevoCurso.setNombre( nombreCurso );

        System.out.println("Ingrese la complejidad del curso");
        System.out.println("1. Alta");
        System.out.println("2. Media");
        System.out.println("3. Baja");
        int complejidad = sc.nextInt();
        sc.nextLine();

//        switch(complejidad){
//            case 1:
//                nuevoCurso.setComplejidad(ComplejidadEnum.ALTA);
//                break;
//            case 2:
//                nuevoCurso.setComplejidad(ComplejidadEnum.MEDIA);
//                break;
//            case 3:
//                nuevoCurso.setComplejidad(ComplejidadEnum.BAJA);
//                break;
//            default:
//                nuevoCurso.setComplejidad(null);
//        }

        //JAVA 17 - SWITCH
        nuevoCurso.setComplejidad(
                switch (complejidad){
                    case 1 -> ComplejidadEnum.ALTA;
                    case 2 -> ComplejidadEnum.MEDIA;
                    case 3 -> ComplejidadEnum.BAJA;
                    default -> null;
                }
        );

        System.out.println("Ingrese cantidad de horas del curso: ");
        int horas = sc.nextInt();
        sc.nextLine();
        nuevoCurso.setCantidadHoras(horas);

        this.cursos.add(nuevoCurso);
        System.out.println("Curso creado satisfactoriamente");

        return nuevoCurso;
    }

    public void inscribirEstudianteACurso(UUID idCurso, Long dni){

        Estudiante estudiante = null;
        boolean existeElEstudiante = Boolean.FALSE;
        boolean esCursoEncontrado = Boolean.FALSE;

        for (Curso curso: this.cursos){
            if (curso.getEstudiantes().containsKey(dni)){
                estudiante = curso.getEstudiantes().get(dni);
                existeElEstudiante = Boolean.TRUE;
                break;
            }
        }
        if (!existeElEstudiante){
            throw new NoSuchElementException("No existe el estudiante");
        }

        for (Curso curso: this.cursos){
            if (curso.getId().equals(idCurso)){
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(), estudiante);
                esCursoEncontrado = Boolean.TRUE;
                break;
            }
        }

        if (!esCursoEncontrado){
            throw new NoSuchElementException("No existe el curso");
        }else {
            System.out.println("Estudiante asignado al curso");
        }

    }

    /*
        Proporcionar un método para mostrar la información de los estudiantes (nombre, dni y edad) y
        los cursos en los que están inscritos.
     */
    public void listarEstudiantesYCursos(){
        Set<Estudiante> listasEstudiantesSinRepetir = new HashSet<>(); //hashSet para evitar elementos duplicados

        // Recorrer los cursos y agregar estudiantes al HashSet
        for (Curso curso : cursos) {
            listasEstudiantesSinRepetir.addAll(curso.getEstudiantes().values());
        }

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(listasEstudiantesSinRepetir);

        System.out.println("Estudiantes: ");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println( estudiante.toString() );

            for (Curso curso: estudiante.getCursos()) {
                System.out.println(curso.toString());
            }

        }
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void listarCursos(){
        System.out.println("Lista de cursos disponibles");
        for (Curso curso : this.cursos) {
            System.out.println(curso.toString());
        }
    }

}
