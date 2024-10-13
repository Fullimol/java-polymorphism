package Almacenables;

public class BaseDatos implements Almacenable {

    @Override
    public void guardar() {
        System.out.println("Guardando en base de datos");
    }
}
