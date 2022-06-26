package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        System.out.println("Ejercicio 5: Lista de alumnos y calculo de edad");

        // Lista
        List<Alumno> alumnos = List.of(
            new Alumno("Homero", "Simpson", LocalDate.parse("2000-10-30")),
            new Alumno("Juan", "Romero", LocalDate.parse("1997-06-01")),
            new Alumno("Ramon Ignacio", "Rojas", LocalDate.parse("2001-08-27")),
            new Alumno("Facundo", "Arias", LocalDate.parse("2004-06-07")),
            new Alumno("Ramón", "Robledo Castro", LocalDate.parse("2002-01-01"))
            );

        // Map            
        Map<String, Integer> mapalumnos = new HashMap<>();

        // Carga Map        
        for (Alumno alm:alumnos){
            mapalumnos.put(alm.getApellidoNombre(), alm.getEdad());
        }

        // Ordena e imprime        
        mapalumnos.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

}
