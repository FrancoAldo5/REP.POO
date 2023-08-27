/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.practica.pkg13_u2_abstractra;

/**
 *
 * @author josep
 */
public abstract class Figura {
    double x;
    double y;
    
    public Figura(){
        
    }
    
    public Figura(double x, double y){
        this.x=x;
        this.y=y;
    }
    public abstract double calcularArea();
    
    
}
