/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurapractica;

/**
 *
 * @author josep
 */
public class FIGURAPRACTICA {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        cuadrado.mostrarInformacion();

        Triangulo triangulo = new Triangulo(6, 8);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        triangulo.mostrarInformacion();

        Rectangulo rectangulo = new Rectangulo(4, 10);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        rectangulo.mostrarInformacion();

        Paralelogramo paralelogramo = new Paralelogramo(6, 9);
        paralelogramo.calcularArea();
        paralelogramo.calcularPerimetro();
        paralelogramo.mostrarInformacion();

        PoligonoRegular poligono = new PoligonoRegular(5, 7);
        poligono.calcularArea();
        poligono.calcularPerimetro();
        poligono.mostrarInformacion();
    }
}
    
