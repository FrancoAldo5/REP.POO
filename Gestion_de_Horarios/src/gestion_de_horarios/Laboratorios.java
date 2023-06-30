/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_horarios;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author josep
 */

public class  Laboratorios {
    
    String nombreLaboratorio, encargado;
    int capacidad;
    String[] listaEquipos;
    int horaCierre;
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24, null));
    
    
    public Laboratorios(String nombreLaboratorio, int capacidad, String[] listaEquipos, int horaCierre, String encargado, ArrayList<String> horario) {
        this.capacidad = capacidad;
        this.listaEquipos = listaEquipos;
        this.nombreLaboratorio = nombreLaboratorio;
        this.horaCierre = horaCierre;
        this.encargado = encargado;
        this.horario = horario;
    }
    
   
    public boolean verificarDisponibilidad(int hora, String asignatura) {
        if (horario.get(hora) == null && hora < horaCierre) {
            horario.add(hora, asignatura);
            return true;
        } else {
            return false;
        }
    }
}

