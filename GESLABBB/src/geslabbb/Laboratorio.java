package geslabbb;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private List<String> equipos;

    public Laboratorio(String nombre, int capacidad, List<String> equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
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

    public boolean verificarDisponibilidad(String horario) {
 
        return true; 
    }
}
