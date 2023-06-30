/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_horarios;

import java.util.ArrayList;

public class Quimica extends Laboratorios {
    String lugar;
    int numecroscopio;
    Iterable<String> equipoList;
    String numMicrooscopios;

    public Quimica(String nombreLaboratorio, int capacidad, String[] listaEquipos, int horaCierre, ArrayList<String> horario, String encargado, String lugar, int numecroscopio) {
        super(nombreLaboratorio, capacidad, listaEquipos, horaCierre, encargado, horario);
        this.lugar = lugar;
        this.numecroscopio = numecroscopio;
    }

    boolean disponibilidad(int horaAsig, String nombreAsig) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
