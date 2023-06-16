/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado_14_6;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Figura {
    Scanner leer = new Scanner(System.in);
    int cuadrado;
    
    
    public int cuadrado(){
        int a;
        System.out.println("Area y perimetro de un cuadrado:");
        System.out.println("Ingrese el lado del cuadrado");
        a = leer.nextInt();
        return a;
    }
    
    
}
