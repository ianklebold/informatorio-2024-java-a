package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};

        System.out.println("El tamano del arreglo es :" + array.length );
        System.out.println("Acceder al valor de la posicion 3 :" + array[2] );

        System.out.println("");

        boolean[] array2 = new boolean[6];
        System.out.println("Valor en la posicion 1 " + array2[0]);

        //Cambiar el valor de un elemento en una posicion
        array[0] = 100;
        System.out.println("Acceder al valor de la posicion 1 :" + array[0]);

        int[] enteros = {5,23,7,2,2,1,1};

        for(int i=enteros.length-1; i>=0; i--){
            System.out.println("indice "+i+ " valor "+enteros[i]);
        }


    }
}
