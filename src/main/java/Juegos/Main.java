package Juegos;

public class Main {

    public static void main(String[] args) {
        Juego futbol = new Futbol();
        Juego ajedrez = new Ajedrez();
        
        futbol.iniciar();;
        ajedrez.iniciar();
    }
}
