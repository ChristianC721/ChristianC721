package PC1.problema1;

public class Usuario extends Habitacion{
    private String nombre;
    private String dni;
    private int edad;
    private int numregistro;

    //constructor por defecto
    public Usuario() {
    }

    //constructor nombre, dni y edad
    public Usuario(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }


}
