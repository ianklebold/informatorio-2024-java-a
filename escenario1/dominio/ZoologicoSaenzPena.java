package escenario1.dominio;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoSaenzPena implements ZoologicoInterface{
    private List<Animal> animales = new ArrayList<>();

    public ZoologicoSaenzPena(List<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public void hacerSonidoAnimal() {
        System.out.println("Zoologico Saenz Pena");

        for (Animal animal : animales) {
            System.out.println("Animal :");
            animal.hacerSonido();
        }

    }
}
