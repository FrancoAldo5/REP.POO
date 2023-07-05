/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_practica_14_interfaces;

/**
 *
 * @author josep
 */
public class Rectangulo implements Figura,Dibujar,Rotar{
    double a,b;
    
    public Rectangulo(double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double calcularArea() {
        double resul=a*b;
        return resul;
        
    }

    @Override
    public void dibujar() {
        
    }

    @Override
    public void rodar() {
        
    }
    
}
