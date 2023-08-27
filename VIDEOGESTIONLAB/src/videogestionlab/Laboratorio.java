/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogestionlab;

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
    
    public boolean verificarDispinibilidad(String horario){
        
        return true;
        
    }

    String getTipoEspacio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDisponibilidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    }
    
    
    

