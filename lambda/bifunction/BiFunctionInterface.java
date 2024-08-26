package lambda.bifunction;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {

        //R apply(T t, U u);
        BiFunction<String, Integer, String> biFunction = (x,y) -> y + " " + x;

        ejemploMetodo( (x,y) -> y + " " + x,"Hola tengo ", 25 );
        ejemploMetodo((x,y) -> y + " Otro mensaje " + x,"Hola tengo ", 50 );
        ejemploMetodo((x,y) -> y + " Otro mensaje2 " + x,"Hola tengo ", 30 );
        ejemploMetodo(biFunction,"Hola tengo ", 35 );
    }

    private static void ejemploMetodo(BiFunction<String, Integer, String> biFunction, String mensaje, int edad){
        System.out.println(biFunction.apply("Hola tengo ",23));
    };

}
