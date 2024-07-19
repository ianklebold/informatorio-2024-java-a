package arreglos;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        //Arreglo bidimensional

        int[][] arrBidimensional = {{1,2},{3,4,5}};

        System.out.println("Elemento 0,0 : " + arrBidimensional[0][0]);
        System.out.println("Elemento 0,1 : " + arrBidimensional[0][1]);
        System.out.println("Elemento 1,0 : " + arrBidimensional[1][0]);
        System.out.println("Elemento 1,1 : " + arrBidimensional[1][1]);

        for (int i = 0; i < arrBidimensional.length; i++) {
            for (int j = 0; j < arrBidimensional[i].length; j++) {
                System.out.println("Elemento : " + i + " , " + j + " : " + arrBidimensional[i][j]);
            }
        }
    }
}
