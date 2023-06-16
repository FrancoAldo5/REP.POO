/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }
    
    @Override
    public void calcularArea() {
        area = lado * lado;
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }
}