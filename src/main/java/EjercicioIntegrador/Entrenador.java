package EjercicioIntegrador;

public abstract class Entrenador {

    //atributos
    private int legajo;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    //constructor
    public Entrenador(int legajo, String nombre, String apellido, int anioIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    //metodos
    public String getNombreCompleto() {
        return nombre;
    }

    abstract double calcularSueldo();

    public int getAnioIngreso() {
        return anioIngreso;
    }
}
