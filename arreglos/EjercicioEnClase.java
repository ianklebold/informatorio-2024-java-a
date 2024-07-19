package arreglos;

public class EjercicioEnClase {
    public static void main(String[] args) {
        /*
        Dado un arreglo de 4 posiciones crear un programa en java
        que permita tomar los dos valores del medio eliminando los extremos.
        Mostrar por pantalla el resultado

        {1,2,3,4} --> {2,3}
         */

        //Dario Rolón
        //int[] arreglo = { 1, 2, 3, 4 };
        //for (int i = 1; i < ((arreglo.length) - 1); i++) {
        //    System.out.println(arreglo[i]);
        //}

        //Pablo Giordano
        //int[] arr01 = {1,2,3,4};
        //for(int i=0;i<arr01.length;i++){
        //    if(i>0 && i<arr01.length-1){
        //        System.out.println("Valor " + arr01[i]);
        //    }
        //}

        //HERNÁN Ismael
        //int[] arr = {1,2,3,4};
        //int[] arr2 = {arr[1],arr[2]};
        //System.out.println("{"+arr2[0]+", "+arr2[1]+"}");


        //Juan Carlos
        //String [] arreglo1 = {"a","b","c","d"};
        //System.out.println("Valores Centrales: " + arreglo1[arreglo1.length/2 - 1] + " y " + arreglo1[arreglo1.length/2] );


        //Cam

        /*
        int array[] = {3,6,9,4};
        int indice2 = array[1];
        int indice3 = array[2];

        System.out.println("Los valores del medio son : " + indice2 + " y " + indice3);*/

        //Leonardo Reichert
        int[] enteros = {1,2,3,4};

        for(int i=enteros.length-2; i>0; i--){
            System.out.println("indice "+i+ " valor "+enteros[i]);
        }
    }
}
