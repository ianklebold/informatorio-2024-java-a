package ar.com.instituto.service.archivos.impl;

import ar.com.instituto.domain.Curso;
import ar.com.instituto.service.archivos.ArchivosCursosService;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivosCursosServiceImpl implements ArchivosCursosService {
    private final String UBICACION_ARCHIVO = "\\src\\main\\java\\ar\\com\\instituto\\recursos\\";

    CSVWriter csvWriter;

    @Override
    public void exportarCursosCsv(List<Curso> cursos){

        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat("nuevos-cursos.csv");

        try{
            this.csvWriter = new CSVWriter(new FileWriter(ruta));
            //Creamos encabezado
            String[] encabezado = {"ID","NOMBRE","CANTIDAD DE HORAS","COMPLEJIDAD"};
            this.csvWriter.writeNext(encabezado);

            for (Curso curso : cursos) {
                String[] datos = {
                    curso.getId().toString(),
                    curso.getNombre(),
                    curso.getCantidadHoras().toString(),
                    curso.getComplejidad().toString()
                };
                this.csvWriter.writeNext(datos);
            }

            //Cerrar el csvWriter
            System.out.println("Exportacion exitosa");

        }catch (IOException e){
            System.out.println("Algo salio mal motivo :" + e.getMessage().concat(" Ubicacion archivo : " + ruta));
        }
    }

    @Override
    public void cerrarWriter() {
        if (this.csvWriter != null){
            try{
                this.csvWriter.close();
            }catch (IOException e){
                System.out.println("Algo salio mal motivo :" + e.getMessage());
            }
        }
    }


}
