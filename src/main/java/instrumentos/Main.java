
package instrumentos;


public class Main {
    public static void main(String[] args) {
        Instrumento violin = new Violin();
        Instrumento trompeta = new Trompeta();
        
        violin.afinar();
        trompeta.afinar();
    }
}
