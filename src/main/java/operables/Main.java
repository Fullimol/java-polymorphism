package operables;

public class Main {

    public static void main(String[] args) {
        Operable cuenta1 = new Calculadora();
        Operable cuenta2 = new RobotQuirurgico();

        cuenta1.operar();
        cuenta2.operar();
    }
}
