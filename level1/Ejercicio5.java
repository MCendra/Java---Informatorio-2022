package level1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int int_a, int_b;
        
        System.out.println("Ejercicio 5: Suma sucesiva");
        System.out.print("Ingrese primer número: ");
        int_a = in.nextInt();
        
        System.out.print("Ingrese segundo número: ");        
        int_b = in.nextInt();

        in.close();

        System.out.print(int_a + "*" + int_b + " = " + SumaSucesiva(int_a, int_b));
    }

    public static Integer SumaSucesiva(Integer arg_a, Integer arg_b) {
        int resultado = 0;
        if (arg_a != 0 && arg_b != 0)
            for (int i = 1; i<=arg_a; i++)
                resultado = resultado + arg_b;
        return resultado;
    }
}
