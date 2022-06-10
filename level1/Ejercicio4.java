package level1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Ejercicio 4: Factorial");
        System.out.print("Ingrese un número: ");
        a = in.nextInt();
        in.close();
        
        System.out.println("El factorial de " + a + " es: " + factorial(a));
    
    }

    public static Integer factorial(Integer val) {
        if (val==0)
        return 1;
      else
        return val * factorial(val-1);
    }
}
