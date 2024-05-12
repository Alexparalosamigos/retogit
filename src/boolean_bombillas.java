import java.util.Scanner;

public class boolean_bombillas {
/*
    Hay 2 bombillas apagadas(b1 y b2). Introducir por teclado valores válidos para el día del mes y el mes.
    Si día del mes y el mes es par encender b1. Si día o el mes es impar encender b2.
    USAR VARIABLES DE TIPO BOOLEAN.
     */

    public static void main (String[] args){
        int mes;
        int diaMes;


        Scanner teclado = new Scanner (System.in);
        System.out.println ("Introduzca el día del mes");
        diaMes = teclado.nextInt();
        System.out.println ("Introduzca el número de mes");
        mes = teclado.nextInt();
        int restoMes = mes%2;
        int restoDiaMes = diaMes%2;

        boolean b1 = restoMes==0 && restoDiaMes==0;
        boolean b2 = restoMes!=0 || restoDiaMes!=0;
        System.out.println ("Se enciende la bombilla b1: " +b1);
        System.out.println ("Se enciende la bombilla b2: " +b2);

    }



}

