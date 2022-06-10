package level1;

public class DatosPersonales {
    
    private String nombre_apellido, direccion, ciudad;
    private int edad;

    public DatosPersonales(String nombre_apellido, Integer edad, String direccion, String ciudad) {

        this.nombre_apellido = nombre_apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;

    }

    @Override
    public String toString(){
        return String.format("%s - %s - %s - %s", ciudad, direccion, String.valueOf(edad), nombre_apellido );
    }

}