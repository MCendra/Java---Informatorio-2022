package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Set<Empleado> empleados = new HashSet<>();

        System.out.println("Ejercicio 6: Operaciones con HashSet y Map");

        // Clase Empleado guarda los datos del HashSet
        empleados.add(new Empleado("Mario Cantero","25.468.256",12,350));
        empleados.add(new Empleado("Ruben Soto","38.256.147",12,350));
        empleados.add(new Empleado("Sandra Rodriguez","28.135.478",8,450));
        empleados.add(new Empleado("Mario Escobar","17.125.340",15,400));
        empleados.add(new Empleado("Regelio Monzon","18.522.633",7,550));
        // Mostramos
        System.out.println(empleados);
        // Crea Map
        Map<String, Integer> sueldos=new HashMap<>();
        // Carga Map
        for (Empleado emp:empleados){
            sueldos.put(emp.getEmpDNI(), emp.getSueldo());
        }
        // Mostramos
        sueldos.forEach((dni,sueldo)->System.out.println("D.N.I: "+ dni +" = $"+ sueldo));
    }
}