package escenario1;

import escenario1.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ZoologicoInterface> listaZoologico = new ArrayList<ZoologicoInterface>();

        Perro perro = new Perro("Firulais",10);
        Perro perro2 = new Perro("Juan",2);
        Gato gato = new Gato("Leo", 10,"Calle");

        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(perro2);
        animales.add(gato);

        Zoologico zoologico = new Zoologico(animales);

        Perro perroSp = new Perro("Firulais SP",10);
        Perro perro2Sp = new Perro("Juan SP",2);
        Gato gatoSp = new Gato("Leo SP", 10,"Calle");

        List<Animal> animalesSp = new ArrayList<>();
        animales.add(perroSp);
        animales.add(perro2Sp);
        animales.add(gatoSp);

        ZoologicoSaenzPena zoologicoSaenzPena = new ZoologicoSaenzPena(animalesSp);

        listaZoologico.add(zoologico);
        listaZoologico.add(zoologicoSaenzPena);

        for (ZoologicoInterface zoo : listaZoologico) {
            zoo.hacerSonidoAnimal();
        }

    }
}
