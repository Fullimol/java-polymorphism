/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mensajes;

/**
 *
 * @author usuario
 */
public class Gerente extends Empleado {
    private int empleadosSupervisados;

    public Gerente(String nombre, double salario, int empleadosSupervisados) {
        super(nombre, salario); // Llama al constructor de la clase base Empleado
        this.empleadosSupervisados = empleadosSupervisados;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método mostrarInformacion de la clase base
        System.out.println("Número de empleados supervisados: " + empleadosSupervisados);
    }
}
