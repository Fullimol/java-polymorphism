
package Almacenables;

public class Main {
    public static void main(String[] args) {
        Almacenable archivo = new Archivo();
        Almacenable baseDatos = new BaseDatos();
        
        
        archivo.guardar();
        baseDatos.guardar();
    }
}
