package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre, apellido;
    private LocalDate nacimiento;

    public Alumno (String nombre, String apellido, LocalDate nacimiento) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;

    }

    public final String getNombre() {
        return nombre;
    }

    public final String getApellido() {
        return apellido;
    }

    public final String getApellidoNombre() {
        return apellido + " " + nombre;
    }

    public final Integer getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString(){
        return String.format("%s %s=%s", nombre, apellido, String.valueOf(nacimiento));
    }

}
