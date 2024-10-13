/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensajes;

/**
 *
 * @author usuario
 */
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, double salario, String lenguajeProgramacion) {
        super(nombre, salario); // Llama al constructor de la clase base Empleado
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método mostrarInformacion de la clase base
        System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
    }
}
