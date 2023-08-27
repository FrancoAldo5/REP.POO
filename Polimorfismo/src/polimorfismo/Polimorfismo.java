/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author josep
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura figura1 = new Rectangulo(6,7);
        Figura figura2 = new Circulo(4);
        
        mostrarArea(figura1);
        mostrarArea(figura2);
        // TODO code application logic here
    }
    
    public static void mostrarArea(Figura figura){
        System.out.println("El area es:"+figura.calcularArea());
        
    }
    
}
