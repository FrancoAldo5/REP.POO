/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author josep
 */
public class Vehiculo {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void arrancar(){
        System.out.println("El vehiculo esta arrancando");
    }
    
    public void detener(){
        System.out.println("El vehiculo de esta deteniendo");
    }
    
    public void mostrarInfo(){
        System.out.println("Marca:"+marca);
        System.out.println("Modelo:"+modelo);
    }
    
}
