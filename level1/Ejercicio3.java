package level1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        String cadena = "";

        System.out.println("Ejercicio 3: Bucle");
        System.out.print("Ingrese un número: ");
        a = in.nextInt();
        in.close();        

        if (a > 0){
            for (int num=1; num <= a; num++) {
                cadena = cadena + num;
                System.out.println(cadena);
            }                
        }
        else{
            System.out.print(a);
        }
    }
}