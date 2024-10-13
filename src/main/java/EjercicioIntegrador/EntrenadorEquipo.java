package EjercicioIntegrador;

public class EntrenadorEquipo extends Entrenador {

    //atributos
    private double sueldoFijo;

    //constructor
    public EntrenadorEquipo(int legajo, String nombre, String apellido, int anioIngreso, double sueldoFijo) {
        super(legajo, nombre, apellido, anioIngreso);
        this.sueldoFijo = sueldoFijo;
    }

    //metodos
    @Override
    public double calcularSueldo() {
        double sueldo = 0;
        int anioExperiencia = 2024 - getAnioIngreso();

        if (anioExperiencia < 3) {
            sueldo = sueldoFijo;
        } else if (anioExperiencia >= 3 && anioExperiencia < 6) {
            sueldo = sueldoFijo * 1.04;
        } else if (anioExperiencia > 6) {
            sueldo = sueldoFijo * 1.12;
        }
        return sueldo;
    }
}
