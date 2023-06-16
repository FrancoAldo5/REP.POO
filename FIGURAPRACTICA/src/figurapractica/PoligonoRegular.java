/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class PoligonoRegular extends Figura {
    private int lados;
    private double longitudLado;
    
    public PoligonoRegular(int lados, double longitudLado) {
        super("Polígono Regular");
        this.lados = lados;
        this.longitudLado = longitudLado;
    }
    
    @Override
    public void calcularArea() {
        // Cálculo del área de un polígono regular específico
    }
    @Override
public void calcularPerimetro() {
    perimetro = lados * longitudLado;
}
}
