package EjercicioIntegrador;

public class PersonalTrainer extends Entrenador {

    //atributos
    private int numClientes;
    private double sueldoMinimo;
    private double montoPorCliente;

    //contructor
    public PersonalTrainer(int legajo, String nombre, String apellido, int anioIngreso, int numClientes, double sueldoMinimo, double montoPorCliente) {
        super(legajo, nombre, apellido, anioIngreso);
        this.numClientes = numClientes;
        this.sueldoMinimo = sueldoMinimo;
        this.montoPorCliente = montoPorCliente;
    }

    //metodos
    @Override
    public double calcularSueldo() {
        double sueldo = numClientes * montoPorCliente;

        if (sueldo < sueldoMinimo) {
            return sueldoMinimo;
        } else {
            return sueldo;
        }
    }

    public int getNumClientes() {
        return numClientes;
    }
}
