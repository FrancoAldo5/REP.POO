/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas1;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class GestionNotas24 {
    ArrayList<Double> notas;
    
    public GestionNotas24(){
        notas=new ArrayList<>();
    }
    
    public void guardarNota(double n){
        notas.add(n);
    }
    public double media(){
        double media=0;
        for (double d:notas){
            media+=d;
        }
        return media/notas.size();
    }
    
    public int aprobados(){
        int ap=0;
        for (double d:notas){
            if(d>=14){
                ap++;
            }
        }
        return ap;
    }

    public void guardarNotas(double notas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
