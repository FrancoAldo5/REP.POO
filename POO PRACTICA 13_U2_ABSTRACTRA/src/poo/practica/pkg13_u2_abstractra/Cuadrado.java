/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.practica.pkg13_u2_abstractra;

/**
 *
 * @author josep
 */
public class Cuadrado extends Figura{
    double lado;
    
    public Cuadrado(){
        
    }

    
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    


    @Override
    public double calcularArea() {
        double resul=lado*lado;
        return resul;
        
    }
        
    
}
