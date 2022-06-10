package level1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int int_a, int_b;
        
        System.out.println("Ejercicio 6: Cálculo de potencia");
        System.out.print("Ingrese base: ");
        int_a = in.nextInt();
        
        System.out.print("Ingrese exponente: ");        
        int_b = in.nextInt();

        in.close();

        System.out.print(int_a + " elevado a " + int_b + " = ");

        if (int_b == 0)
            System.out.print("1");
        else if (int_b > 0)
            System.out.print(CalcularInt(int_a, int_b));
        else
            System.out.print(1 / CalcularDbl(int_a, int_b * -1));
    }

    public static Integer CalcularInt (Integer arg_a, Integer arg_b){
        int int_r = 1;
        for (int i = 1; i <= arg_b; i++) {
            int_r *= arg_a;
        }
        return int_r;
    }
    
    public static Double CalcularDbl (Integer arg_a, Integer arg_b){
        double dbl_r = 1;
        for (double i = 1; i <= (double) arg_b; i++) {
            dbl_r *= (double) arg_a;
        }
        return dbl_r;
    }

}


