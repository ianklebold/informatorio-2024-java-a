package escenario2.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private Long dni;
    private List<Curso> cursos = new ArrayList<>();
    private String nombre;
    private LocalDate fechaNacimiento;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears(); // Retornar los años
    }

    @Override
    public String toString() {

        //Patron builder
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Dni : ")
                .append(this.getDni()).append("\n")
                .append("Nombre : ")
                .append(this.getNombre()).append("\n")
                .append("Edad : ")
                .append( getEdad(this.getFechaNacimiento()) ).append("\n")
                .append("-------------------------------------------------------\n")
                .toString();
    }
}
