package lambda.predicate;

import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {

        //Metodo abstracto --> boolean test(T t);
        Predicate<Integer> esPar = x -> x % 2 == 0;

        System.out.println("Resultado de test : " + esPar.test(5));
        System.out.println("Resultado de test : " + esPar.test(10));
        System.out.println("Resultado de test : " + esPar.test(8));
        System.out.println("Resultado de test : " + esPar.test(9));

    }

}
