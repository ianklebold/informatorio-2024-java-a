package imperativa.conversiones;

public class Conversiones {
    public static void main(String[] args) {

        //Conversion de tipo promocion
        int value1 = 5;

        //Conversion de tipo contraccion
        int value2 = (int)5.69f; //Cast
        System.out.println(value2);

        //Conversion de tipo implicita
        double value3 = 10 * 20.5d;
        System.out.println(10 * 20.5d);

        int value4 = 1 + 2 * 4;
        System.out.println(value4);

    }
}
