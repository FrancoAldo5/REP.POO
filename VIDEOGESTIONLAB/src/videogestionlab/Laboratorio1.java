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
class Laboratorio1 extends Laboratorio {
    private String tipoEspacio;
    private String disponibilidad;

    public Laboratorio1(String nombre, int capacidad, List<String> equipos, String tipoEspacio, String disponibilidad) {
        super(nombre, capacidad, equipos);
        this.tipoEspacio = tipoEspacio;
        this.disponibilidad = disponibilidad;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
}
