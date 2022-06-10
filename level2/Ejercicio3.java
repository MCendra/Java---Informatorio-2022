package level2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    private static String[] palos={"Tréboles","Diamantes","Corazones", "Picas"};
    private ArrayList<Carta> cartas;

    public static void main(String[] args) {
        
        Ejercicio3 e = new Ejercicio3();
        e.cartas = new ArrayList<Carta>();

        System.out.println("Ejercicio 3: Baraja Francesa");

        e.ArmarBaraja();

        System.out.printf("Baraja armada: % d cartas en la baraja. %n%n",e.cartas.size());

        e.ImprimirBarajaOrdenada();

        e.ImprimirBarajaInversa();

        e.ImprimirBarajaAleatorio();

    }

    public void ArmarBaraja(){

        for(String palo: palos)
            for(int i=1;i<=10;i++)
                this.cartas.add(new Carta(i, palo));

    }

    public void ImprimirBarajaOrdenada() {

        System.out.printf("Cartas ordenadas: %s %n%n", this.cartas.toString());

    }

    public void ImprimirBarajaInversa() {

        Collections.reverse(this.cartas);
        System.out.printf("Cartas ordenadas a la inversa: %s %n%n", this.cartas.toString());

    }

    public void ImprimirBarajaAleatorio() {

        Collections.shuffle(this.cartas);
        System.out.printf("Cartas desordenadas: %s %n", this.cartas.toString());

    }
}        