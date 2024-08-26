package lambda.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
    public static void main(String[] args) {
        //void accept(T t, U u);
        BiConsumer<String, Integer> biConsumer = (x , y) -> System.out.println(x + " " + y);
        biConsumer.accept("Hola tengo : ", 50);


        Map<String,String> mapCapitalCities = new HashMap<>();

        //BiConsumer<T,U> es una interfaz funciona con un metodo abstracto
        // void accept(T t,U u)
        //Lo interesante del metodo .put es que devuelve un valor, pero no sera tenido en cuenta por el .accept(T,U)
        BiConsumer<String,String> biConsumerMap = (key, value) -> mapCapitalCities.put(key,value);

        biConsumerMap.accept("Dublin","Ireland");
        biConsumerMap.accept("Washington D.C","USA");

        System.out.println(mapCapitalCities);

        BiConsumer<String,String> mapPrint = (key,value) -> System.out.println(key + " is the capital of : "+value);
        mapCapitalCities.forEach(mapPrint);
    }
}
