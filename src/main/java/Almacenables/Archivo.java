
package Almacenables;


public class Archivo implements Almacenable{
    @Override
    public void guardar(){
        System.out.println("Guardando en un archivo");
    }
}
