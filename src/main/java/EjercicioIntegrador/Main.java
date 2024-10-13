package EjercicioIntegrador;

public class Main {

    public static void main(String[] args) {
        Entrenador[] entrenadores = {
            new EntrenadorEquipo(1111, "Carlos", "Lopez", 2000, 250000),
            new PersonalTrainer(2222, "Marcelo", "Facho", 2022, 1, 100000, 20000)
        };
        Gimnasio gimnasio = new Gimnasio(entrenadores);

        gimnasio.mostrarSueldo();
    }
}
