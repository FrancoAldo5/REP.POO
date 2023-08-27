/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author josep
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro carro = new Carro("Hyaundai","Accent",4);
        carro.mostrarInfo();
        carro.arrancar();
        carro.conducir();
        carro.detener();
        // TODO code application logic here
    }
    
}
