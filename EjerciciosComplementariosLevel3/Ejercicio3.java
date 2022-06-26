package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 3: Coincidencias");
        
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        
        System.out.print(cuantasComienzanCon(palabras, "B"));

    }

    public static Long cuantasComienzanCon(List <String> lista, String texto) {

        return lista.stream()
             .filter(x -> x != null)
             .filter(x -> x != "")
             .filter(x -> x.regionMatches(true, 0, texto, 0, texto.length()))
             .count();

    }
    
}
    