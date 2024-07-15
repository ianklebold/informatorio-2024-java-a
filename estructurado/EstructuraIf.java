package estructurado;

public class EstructuraIf {
    public static void main(String[] args) {

        int topPuntaje = 100;

        if ( topPuntaje < 100 ){
            System.out.println("El valor de puntaje es: " + topPuntaje);
        }else {
            System.out.println("El valor de puntaje es menor a 100 : " + topPuntaje);
        }

        System.out.println("Fuera del if");

        int segundoPuntaje = 90;

        if( topPuntaje > segundoPuntaje && topPuntaje <= 100 ){
            System.out.println("El valor de top puntaje es mayor a segundoPuntaje y es menor o igual a 100");
        }

        if (topPuntaje > 90 || segundoPuntaje < 70 ) {
            //Sentencias..
        }

    }
}
