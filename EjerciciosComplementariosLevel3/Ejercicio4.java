package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        System.out.println("Ejercicio 4: Factorial de lista sin repetir valores");

        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        System.out.print(factorialDeLista(numeros));

    }

    public static List<Integer> factorialDeLista(List<Integer> lista) {

        return lista.stream()
            .distinct()
            .map(x -> factorial(x))
            .collect(Collectors.toList());

    }

    public static Integer factorial(Integer val) {
        if (val==0)
            return 1;
        else
            return val * factorial(val-1);
    }
    
}
