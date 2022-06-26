package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 2: Potencia de números en lista");

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        System.out.print(potenciaLista(numeros));

    }

    public static List<Integer> potenciaLista(List<Integer> lista ) {

        return lista.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());

    }
    
}