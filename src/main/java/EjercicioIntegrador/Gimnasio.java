package EjercicioIntegrador;

public class Gimnasio {

    //atributos
    private Entrenador[] entrenadores;

    //constructor
    public Gimnasio(Entrenador[] entrenadores) {
        this.entrenadores = entrenadores;
    }

    //metodos
    public void mostrarSueldo() {
        for (Entrenador entrenador : entrenadores) {
            System.out.println("El sueldo de " + entrenador.getNombreCompleto() + " es: $" + entrenador.calcularSueldo());
        }
    }

    //devuelva al personal trainer con mayor cantidad de clientes 
    public void entrenadorConMasClientes(Entrenador[] entrenadores) {
        PersonalTrainer personalConMasClientes = null;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador instanceof PersonalTrainer) { //de todo el array de entrenadores solo tomo los instanciados como personalTrainer
                PersonalTrainer pt = (PersonalTrainer) entrenador; //Si el entrenador es una instancia de PersonalTrainer, esta línea castea(convierte) el objeto entrenador a un PersonalTrainer
                if (personalConMasClientes == null || pt.getNumClientes() > personalConMasClientes.getNumClientes()) {
                    personalConMasClientes = pt;
                }
            }
        }
        if (personalConMasClientes != null) {
            System.out.println("El entrenador con mas clientes es: " + personalConMasClientes.getNombreCompleto());
        } else {
            System.out.println("No hay entrenadores personales en el gimnasio.");
        }
    }
}
