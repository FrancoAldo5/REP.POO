/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author PC-MASTER
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {

    // Atributos
    Color colofondo = Color.black; // Define el color de fondo como negro
    int tammax, tam, can, res; // Declaración de variables para el tamaño y cantidad de cuadros

    // Constructor
    public PanelFondo(int tammax, int can) { // Constructor que recibe el tamaño máximo y la cantidad de cuadros
        this.tammax = tammax; // Asigna el tamaño máximo
        this.can = can; // Asigna la cantidad de cuadros
        this.tam = tammax / can; // Calcula el tamaño de cada cuadro
        this.res = tammax % can; // Calcula el residuo para ajustar la posición
    }

    // Método para dibujar en el panel
    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor); // Llama al método paint de la clase padre

        pintor.setColor(colofondo); // Establece el color de pintura como el color de fondo

        // Dibuja una cuadrícula de cuadrados
        for (int i = 0; i < can; i++) {
            for (int j = 0; j < can; j++) {
                pintor.fillRect(res / 2 + i * tam, res / 2 + j * tam, tam - 1, tam - 1);
                // Dibuja un cuadro en la posición correspondiente
            }
        }
    }
}