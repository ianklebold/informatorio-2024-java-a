package lambda.consumer;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        //void accept(T t);
        Consumer<Integer> sysoutConsumer = sout -> System.out.println(sout);

        sysoutConsumer.accept(10);

        sysoutConsumer = sout ->  System.out.println("Nuevo valor " + sout);

        sysoutConsumer.accept(20);


    }
}
