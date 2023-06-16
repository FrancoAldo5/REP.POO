/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = base * altura;
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
    }
}