package level1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre_apellido;
        Integer edad;
        String direccion;
        String ciudad;
                
        System.out.println("Ejercicio 8: Pide y muestra datos");
        
        System.out.print("Ingrese nombre y apellido: ");
        nombre_apellido = in.nextLine();
        System.out.print("Ingrese edad: ");
        edad =in.nextInt();
        in.nextLine();
        System.out.print("Ingrese direccion: ");
        direccion = in.nextLine();
        System.out.print("Ingrese ciudad: ");
        ciudad = in.nextLine();

        in.close();

        DatosPersonales DatosPersonales = new DatosPersonales(nombre_apellido, edad, direccion, ciudad);

        System.out.println(DatosPersonales.toString());
    }    
}
