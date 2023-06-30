/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_horarios;

import java.util.ArrayList;

public class Computo extends Laboratorios {
    int numcompus;
    String lugar;
    Iterable<String> equipoList;
    String capacidadll;

    public Computo(String nombreLaboratorio, int capacidad, String[] listaEquipos, int horaCierre, ArrayList<String> horario, String encargado, String lugar, int numcompus) {
        super(nombreLaboratorio, capacidad, listaEquipos, horaCierre, encargado, horario);
        this.numcompus = numcompus;
        this.lugar = lugar;
    }

    boolean disponibilidad(int horaAsig, String nombreAsig) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
