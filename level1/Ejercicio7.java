package level1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String texto, resultado = "";
        int int_letra = 0;
       
        System.out.println("Ejercicio 7: Minúsculas a mayúsculas");
        System.out.print("Ingrese un texto en minúsculas: ");
        texto = in.nextLine();
        
        in.close();

        for (int i=0; i<texto.length(); i++) {
            int_letra = (int) texto.charAt(i);
            System.out.println("valor : " + int_letra);
            if (int_letra > 96 && int_letra < 123)
                int_letra -= 32;
            else if (int_letra == 164)
                int_letra += 1;
            resultado = resultado + (char) int_letra;                
        }            
        System.out.println("Texto convertido a mayúsculas: " + resultado);
    }
}