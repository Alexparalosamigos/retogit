import java.util.Scanner;

public class boolean_videolab2 {
/* Crear una clase con su método main donde se declaren tres variables, dos de tipo int y
    una de tipo booleano. Darle el valor que se quiera a cada uno de ellos y hacer la comparación
    en los ejemplos.
     */

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Introduzca el primer número");
        int num1 = scanner.nextInt();
        System.out.println ("Introduzca el segundo número");
        int num2 = scanner.nextInt();
        boolean ComparaciónMayorQue = num1>num2;
        System.out.printf ("El primer número es mayor que el segundo: %b%n", ComparaciónMayorQue);



    }
}

