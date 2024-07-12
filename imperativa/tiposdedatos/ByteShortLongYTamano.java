package imperativa.tiposdedatos;

public class ByteShortLongYTamano {
    public static void main(String[] args) {

        //Byte - 8 bits
        //Clase Wrapper de Byte
        System.out.println("Rango de valor del byte : "+ Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        //Primitivo de Byte
        byte minValue = -128;
        byte maxValue = 127;

        //Short - 16 bits
        //Clase Wrapper de Short
        System.out.println("Rango de valor del short : "+ Short.MIN_VALUE + " " + Short.MAX_VALUE);

        //Primitivo de Short
        short minValueShort = -32768;
        short maxValueShort = 32767;

        //Integer - 32 bits
        //Clase Wrapper de Integer
        System.out.println("Rango de valor del integer : "+ Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        int minValueInt = -2147483648;
        int maxValueInt = 2147483647;

        //Long
        System.out.println("Rango de valor del long : "+ Long.MIN_VALUE + " " + Long.MAX_VALUE);
        long valueLong = 2147483647;

        final long SCREAMER_CAMEL_CASE = 2147483647;

    }
}
