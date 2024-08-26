package lambda.unarybinary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorInterface {
    public static void main(String[] args) {
        // UnaryOperator<T> extiende de Function<T, T> es una interfaz funcional con un metodo abstracto :
        // T apply(T t)
        UnaryOperator<String> unaryOp = name -> "My name is " + name;
        System.out.println("Unary Operator : " + unaryOp.apply("Sean"));


        //BinaryOperator<T> extends BiFunction<T, T, T> es una interfaz funcional con un metodo abstracto :
        // T apply(T t1, T t2)
        BinaryOperator<String> binaryOp = (s1, s2) -> s1.concat(s2);
        System.out.println("Binary Operator : " + binaryOp.apply("William", "Shakespeare"));
    }
}
