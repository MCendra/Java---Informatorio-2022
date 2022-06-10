package level1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre_usuario;
       
        System.out.println("Ejercicio 1: Hola usuario");
        System.out.print("INGRESE NOMBRE DE USUARIO: ");
        nombre_usuario = in.nextLine();

        in.close();
        
        System.out.println("HOLA " + nombre_usuario + "!!!");
        
       
    }
}
