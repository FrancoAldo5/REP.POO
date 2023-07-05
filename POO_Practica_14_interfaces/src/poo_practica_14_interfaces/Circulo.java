/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_practica_14_interfaces;

/**
 *
 * @author josep
 */
public class Circulo implements Figura,Dibujar,Rotar{
    double r;
    
    public Circulo(double r){
        this.r=r;
    }

    @Override
    public double calcularArea() {
        double pi=3.1416;
        double resul=pi*r*r;
        return resul;
        
    }

    @Override
    public void dibujar() {
        System.out.println("Vas a dibujar");
    }

    @Override
    public void rodar() {
        System.out.println("usted va a rodar");
    }
}
