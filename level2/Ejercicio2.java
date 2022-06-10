package level2;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

    private ArrayList<Integer> numeros;

    public static void main(String[] args) {

        Ejercicio2 e = new Ejercicio2();
        e.numeros = new ArrayList<>();

        System.out.println("Ejercicio 2: Agregar elementos en Array");

        System.out.println("Se ingresan 5 números enteros al array");
        e.IngresarDatos(0, 5);

        e.AnalizarDatos();

        System.out.println("Se agrega 1 número entero como primer elemento");
        e.IngresarDatos(0,1);

        System.out.println("Se agrega 1 número entero como último elemento");
        e.IngresarDatos(e.numeros.size() ,1);

        e.AnalizarDatos();

    }

    private void IngresarDatos(Integer posicion, Integer cantidad) {

        Random r = new Random();

        for (int i = 0; i < cantidad; i++) {
            this.numeros.add(posicion,r.nextInt(100)+1);
            posicion++;
        }             
        
    }

    private void AnalizarDatos() {

        int contador=0;

        System.out.println("El contenido actual de ArrayList es: ");
        for (int numero:this.numeros)
            System.out.println("#" + contador++ + " - " + numero);

        System.out.printf("El tamaño actual de ArrayList es de %d elementos %n", this.numeros.size());

    }
}
