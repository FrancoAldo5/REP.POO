/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class Figura {
    protected String tipo;
    protected double area;
    protected double perimetro;
    
    public Figura(String tipo) {
        this.tipo = tipo;
    }
    
    public void calcularArea() {
        // Cálculo del área genérico
    }
    
    public void calcularPerimetro() {
        // Cálculo del perímetro genérico
    }
    
    public void mostrarInformacion() {
        System.out.println("Tipo de figura: " + tipo);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
