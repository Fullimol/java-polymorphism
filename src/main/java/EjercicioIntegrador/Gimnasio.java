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
            System.out.println("El sueldo de " + entrenador.getNombreCompleto() + " es: " + entrenador.calcularSueldo());
        }
    }

    public void entrenadorConMasClientes(PersonalTrainer personalTrainer) {

    }
}
