package lambda.supplier;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        //T get();

        Supplier<StringBuilder> supSb = () -> new StringBuilder();

        System.out.println("Supplier SB: " + supSb.get().append("Ian"));

        Supplier<LocalTime> supTime = () -> LocalTime.now();
        System.out.println("Supplier Time: " + supTime.get());

        Supplier<Double> sRandom = () -> Math.random();
        System.out.println("Random number : " + sRandom.get());
    }
}
