import poo.dominio.Auto;
import poo.dominio.Persona;

public class App {
    public static void main(String[] args) {

        //Para instanciar
        // 1. Tipo de dato -> Clase Persona
        // 2. variable para guardar el objeto
        // 3. Instanciar objeto con new NombreDeClase();
        Persona persona = new Persona();
        persona.setNombre("Ian");
        persona.setApellido("Fernandez");
        persona.setEdad(24);
        persona.setDni(12345678);

        Auto auto = new Auto();
        auto.setColor("Azul");
        auto.setMarca("Marca");
        auto.setModelo("Modelo");
        auto.setPlaca("JAVA123");
        auto.setCantidadDePuertas(5);

        persona.setAuto(auto);


        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());
        System.out.println(persona.getDni());
        System.out.println(persona.getAuto().toString());



        Persona persona2 = new Persona("Lionel","Messi",12345678,37);
        Persona persona3 = new Persona("DePaul");

    }
}
