/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado_14_6;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Cuadrado_14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.println("ingrese el lado");
        lado=leer.nextInt();
        
        Cuadrado cu = new Cuadrado(lado);
        
        int area =cu.calarea();
        int perimetro =cu.calperimetro();
        
        
        System.out.println("area:"+area);
        System.out.println("perimetro:"+perimetro);
        // TODO code application logic here
    }
    
}
