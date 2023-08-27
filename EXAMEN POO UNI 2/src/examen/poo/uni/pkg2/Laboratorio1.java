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
public class Laboratorio1 extends Laboratorio{
    private String tipoEspacio;

    public Laboratorio1(String nombre, int capacidad, List<String> equipos, String tipoEspacio) {
        super(nombre, capacidad, equipos);
        this.tipoEspacio=tipoEspacio;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }
    
    
    public static void verificarDispinibilidad(String horario){
        System.out.println("Horarios ocupados:"+horario);
    }
    
}