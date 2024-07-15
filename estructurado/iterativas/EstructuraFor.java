package estructurado.iterativas;

public class EstructuraFor {
    public static void main(String[] args) {
        boolean activador = true;
        for (int i = 0; activador && i < 10; i++) {
            System.out.println("Cualquier cosa");
            if (i == 3){
                activador = false;
            }
            for (int j = 0; !activador && j < 10; j++) {
                System.out.println("Ejecutar j");
            }
        }
    }
}
