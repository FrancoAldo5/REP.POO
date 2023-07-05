/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_practica_14_interfaces;

/**
 *
 * @author josep
 */
public class Cuadrado implements Figura,Dibujar{
    double lado;
    
    public Cuadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
       double resul=lado*lado;
        return resul;
       
    }

    @Override
    public void dibujar() {
        System.out.println("vas a dibujar");
       
    }
    
}
