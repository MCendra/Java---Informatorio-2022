package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {
    private String[] alumno={"Mario Sanchez","Juan Fretes","Carlos Mone", "Ricardo Samaniego", "Ruben Ortiz", "Pedro Clemente", "Mateo Suarez", "Sofia Gala", "Carla Sandoval", "Ana Matize", "Briana Romero", "Nora Carpena"};
    private ArrayList<String> alumnos;
    private ArrayList<String> cursoa;
    private ArrayList<String> cursob;
    private ArrayList<String> cursoc;        

    public static void main(String[] args) {
        
        Ejercicio4 e = new Ejercicio4();
        // Modo facil de cargar
        e.alumnos = new ArrayList<String>(Arrays.asList(e.alumno));
        e.cursoa = new ArrayList<String>(e.alumnos.subList(0, 4));
        e.cursob = new ArrayList<String>(e.alumnos.subList(4, 8));
        e.cursoc = new ArrayList<String>(e.alumnos.subList(8, 12));

        System.out.println("Ejercicio 4: SubList");
        
        System.out.printf("Se ingresaron 12 nombres de alumnos al ArrayList: %s %n",e.alumnos);

        System.out.println("Se particionaron en 3 cursos");

        System.out.printf("Curso A integrado por: %s %n",e.cursoa);
        System.out.printf("Curso B integrado por: %s %n",e.cursob);
        System.out.printf("Curso B integrado por: %s %n",e.cursoc);
    }
}        