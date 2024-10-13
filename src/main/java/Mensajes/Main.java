/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensajes;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
       Gerente gerente = new Gerente("Carlos", 80000, 10);
        System.out.println("Información del Gerente:");
        gerente.mostrarInformacion();

        // Crear un Desarrollador
        Desarrollador desarrollador = new Desarrollador("Ana", 60000, "Java");
        System.out.println("\nInformación del Desarrollador:");
        desarrollador.mostrarInformacion();
     
    }
}
