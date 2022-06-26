package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Filtrar valores");
        
        List<String> palabras = new ArrayList<>();
            palabras.add("Hola");
            palabras.add(null);
            palabras.add("Informatorio");
            palabras.add("");
      
        filtrar(palabras).forEach(System.out::println);
       
    }

    public static List<String> filtrar(List<String> lista ) {
        
        return lista.stream()
                .filter(x -> x != null)
                .filter(x -> x != "")
                .collect(Collectors.toList());

    }

}