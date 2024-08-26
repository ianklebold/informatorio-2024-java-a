package lambda.function;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        //R apply(T t);
        Function<Integer, String> cuadradoFuncion = x -> String.valueOf(x * x);
        System.out.println( cuadradoFuncion.apply(5) );
    }
}
