package level2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

    private ArrayList<String> lista_ciudades;
    private Scanner in;

    public static void main(String[] args) {

        Ejercicio1 e = new Ejercicio1();
        e.in = new Scanner(System.in);
        e.lista_ciudades = new ArrayList<>();

        System.out.println("Ejercicio 1: Cargar datos en array");

        e.IngresarDatos();

        e.in.close();

        e.MostrarDatos();

    }

    private void IngresarDatos() {

        String ciudad;
        boolean bucle = true;

        System.out.println("Ingrese linea a linea ciudades para agregar - Dejar vacio para mostrar lista");
        while (bucle) {
            ciudad = in.nextLine();
            if (ciudad.length() > 0)
                lista_ciudades.add(ciudad);
            else                
                bucle = false;
        }
    }

    private void MostrarDatos() {
        
        int contador = 1;
        for (String ciudad:this.lista_ciudades)
            System.out.println("#" + contador++ + " - " + ciudad);

    }
}