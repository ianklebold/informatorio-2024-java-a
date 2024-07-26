package escenario1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Zoologico implements ZoologicoInterface{
    private List<Animal> animales = new ArrayList<>();

    public Zoologico(List<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public void hacerSonidoAnimal(){

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
}
