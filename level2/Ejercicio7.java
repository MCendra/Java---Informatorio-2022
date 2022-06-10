package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer int_a=0, int_b=0;
        Boolean bucle=true;
        String[] resultado;

        System.out.println("Ejercicio 7: fizzBuzzFuncion");

        while (bucle) {
            System.out.print("Ingrese primer número: ");
            int_a = in.nextInt();
            
            System.out.print("Ingrese segundo número (debe ser mayor al primer número): ");
            int_b = in.nextInt();

            if (int_a < int_b)
                bucle=false;
            else                                
                System.out.println("Primer número debe ser menor. Intente de nuevo.");
        }

        in.close();

        resultado = fizzBuzzFuncion(int_a, int_b);

        System.out.println(Arrays.toString(resultado));

    }

    private static String[] fizzBuzzFuncion(Integer a, Integer b) {

        String[] respuesta= new String[b - a];
        Integer pos = 0;

        for (int i = a;i<b;i++){
            if (i % 6 == 0)
                respuesta[pos] = "FizzBuzz";
            else if (i % 3 == 0)                
                respuesta[pos] = "Buzz";
            else if (i % 2 == 0)
                respuesta[pos] = "Fizz";
            else
                respuesta[pos] = String.valueOf(i);

            pos++;
        }            

        return (respuesta);                
    }   
}
