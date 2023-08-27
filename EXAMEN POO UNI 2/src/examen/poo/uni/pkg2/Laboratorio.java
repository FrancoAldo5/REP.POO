/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.poo.uni.pkg2;

import java.util.List;

/**
 *
 * @author josep
 */
public class Laboratorio {
    private String nombre;
    private int capacidad;
    private List<String> equipos;

    public Laboratorio(String nombre, int capacidad, List<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos= equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<String> getEquipos() {
        return equipos;
    }
    
    
    public static void verificarDispinibilidad(String horario){
    }
}
