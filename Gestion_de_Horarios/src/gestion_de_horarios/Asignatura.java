/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_horarios;

/**
 *
 * @author josep
 */
public class Asignatura {
    Laboratorios laboratorio;
    String hora;
    String nombre;

    public Asignatura(Laboratorios laboratorio, String hora, String nombre) {
        this.laboratorio = laboratorio;
        this.hora = hora;
        this.nombre = nombre;
    }
    
    
}
