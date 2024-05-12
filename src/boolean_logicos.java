public class boolean_logicos {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 5;
        int num3 = 2;
        int num4 = 4;

        Boolean CondiciónAND = num1>num2 && num3<num4;
        System.out.println("El resultado de la condición AND es "+CondiciónAND);
        /* AND = Las dos condiciones deben ser verdaderas para que el resultado sea true.
        En caso contrario el resultado será false.
        En este caso el resultado es true / true, y por tanto será true.
         */

        Boolean CondiciónOR = num1<num2 || num3<num4;
        System.out.println("El resultado de la condición OR es "+CondiciónOR);
        /* OR = Una de las dos condiciones debe ser verdadera para que el resultado sea true.
        En caso contrario el resultado será false.
        En este caso el resultado es false / true, y por tanto será true.
         */

        Boolean CondiciónNOT = ! (num1<num2);
        System.out.println ("El resultado de la condición NOT es "+CondiciónNOT);
        /* NOT = Da la negación del resultado natural.
        En este caso el resultado es falso, y por tanto true (lo contrario).
         */

    }
}

