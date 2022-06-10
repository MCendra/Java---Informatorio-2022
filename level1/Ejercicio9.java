package level1;

import java.util.Scanner;

public class Ejercicio9 {

    private static Scanner in = new Scanner(System.in);
    private int contador = 0;
    private String texto;
    private char letra;

    public static void main(String[] args) {

        // Prueba sacar mensaje Local variable no defi...
        // contador++ no se toma como definido
        Ejercicio9 e = new Ejercicio9();
        int i, r = e.contador;
    
        System.out.println("Ejercicio 9: Contar letra");
        System.out.print("Ingrese un texto o frase: ");
        e.texto = in.nextLine();

        System.out.print("Ingrese letra a contar: ");
        e.letra = in.next().charAt(0);

        in.close();

        for (i = 0; i < e.texto.length(); i++)
            if (e.letra == e.texto.charAt(i))
                r++;

        if (r == 1)
            // Prueba variable con formato
            System.out.format("El caracter %s aparece% d vez.",e.letra,r);
        else
            System.out.format("El caracter %s aparece% d veces.",e.letra,r);            
    }
}
