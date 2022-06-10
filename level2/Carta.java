package level2;

public class Carta {

    private int valor;
    private String palo;

    public Carta(int valor, String palo){
 
        this.palo = palo;
        this.valor = valor;

    }

    @Override
    public String toString(){
        return String.format("%s de %s", String.valueOf(valor), palo);
    }
}