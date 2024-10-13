package EjercicioIntegrador;

public class Main {
    
    public static void main(String[] args) {
        Entrenador[] entrenadores = {
            new EntrenadorEquipo(1111, "Carlos", "Lopez", 2021, 550000),
            new PersonalTrainer(2222, "Marcelo", "Facho", 2022, 18, 100000, 20000),
            new PersonalTrainer(2222, "Juan", "Mendoza", 2020, 20, 100000, 20000)
        };
        Gimnasio gimnasio = new Gimnasio(entrenadores);
        
        gimnasio.mostrarSueldo();
        
        gimnasio.entrenadorConMasClientes(entrenadores);
    }
}
