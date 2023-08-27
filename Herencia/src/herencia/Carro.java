/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author josep
 */
public class Carro extends Vehiculo{
    int puertas;

    public Carro( String marca, String modelo,int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }
    
    public void conducir(){
        System.out.println("El coche esta en movimiento");
    }
    
    
    
}
