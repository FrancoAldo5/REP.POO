/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class Paralelogramo extends Figura {
    private double base;
    private double altura;
    
    public Paralelogramo(double base, double altura) {
        super("Paralelogramo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = base * altura;
    }
    
    @Override
    public void calcularPerimetro() {
        // Cálculo del perímetro de un paralelogramo específico
    }
}