package level2;

import java.util.ArrayList;

public class Ejercicio5 {
    private Integer[] horas_trabajadas={6,7,8,4,5};
    private Integer[] valor_horas={350, 345, 550, 600, 320};
    private ArrayList<Integer> horas = new ArrayList<Integer>();;
    private ArrayList<Integer> valor = new ArrayList<Integer>();;
    private ArrayList<Integer> totales = new ArrayList<Integer>();;
    private Integer totalfinal = 0;

    public static void main(String[] args) {
        
        Ejercicio5 e = new Ejercicio5();

        System.out.println("Ejercicio 5: Operaciones con ArrayList");

        //Otro modo
        e.CargarArray(e.horas, e.horas_trabajadas);
        e.CargarArray(e.valor, e.valor_horas);

        // Calculo
        for (int i = 0;i<e.horas.size();i++){
            e.totales.add(i,e.horas.get(i) * e.valor.get(i));
            e.totalfinal += e.totales.get(i);  
        }
        
        //Imprimo
        System.out.printf("Horas trabajadas: %s %n",e.horas);
        System.out.printf("Valor de horas: %s %n",e.valor);
        System.out.printf("Totales: %s %n",e.totales);
        System.out.printf("Total final: $%d %n",e.totalfinal);
    }

    private void CargarArray(ArrayList<Integer> arraylist, Integer[] datos){

        for (Integer d:datos){
            arraylist.add(d);
        }

    }
}