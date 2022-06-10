package level1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numero_a;
        int numero_b;
        
        System.out.println("Ejercicio 2: Operaciones con números");
        System.out.print("Ingrese primer número:");
        numero_a = in.nextInt();
        
        System.out.print("Ingrese segundo número:");        
        numero_b = in.nextInt();

        in.close();

        System.out.println(numero_a + " + " + numero_b + " = " + (numero_a + numero_b));
        System.out.println(numero_a + " - " + numero_b + " = " + (numero_a - numero_b));
        System.out.println(numero_a + " * " + numero_b + " = " + (numero_a * numero_b));
        System.out.println(numero_a + " / " + numero_b + " = " + (numero_a / numero_b));
        System.out.println(numero_a + " % " + numero_b + " = " + (numero_a % numero_b));
    }
}
