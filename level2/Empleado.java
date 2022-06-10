package level2;

public class Empleado {

    private String nombreyapellido;
    private String dni;
    private Integer horastrabajadas;
    private Integer valorporhora;

    public Empleado(String nombreyapellido, String dni, Integer horastrabajadas, Integer valorporhora) {
        
        this.nombreyapellido = nombreyapellido;
        this.dni = dni;
        this.horastrabajadas = horastrabajadas;
        this.valorporhora = valorporhora;

    }

    public final String getEmpNombreApellido() {
        return nombreyapellido;
    }

    public final String getEmpDNI() {
        return dni;
    }

    public final Integer getHorasTrabajadas() {
        return horastrabajadas;
    }

    public final Integer getEmpValorHora() {
        return valorporhora;
    }

    public final Integer getSueldo() {
        return horastrabajadas * valorporhora;
    }    

    @Override
    public String toString(){
        return String.format("Empleado: %s, D.N.I: %s, Horas trabajadas: %d, Valor de la hora: %s", this.nombreyapellido,this.dni,this.horastrabajadas,this.valorporhora );
    }
    
}
