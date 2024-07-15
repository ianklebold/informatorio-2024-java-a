package estructurado.iterativas;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        int contador = 10;

        do {
            if (contador != 0 ){
                System.out.println("Hola soy el numero : " + contador);
                contador = contador - 1;
            }
        }while (contador > 0 );
    }
}
