/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulado;

/**
 *
 * @author josep
 */
public class CuentaBancaria {
    private double saldo;
    
    public void depositar(double cantidad){
        if (cantidad>0){
            saldo+=cantidad;
            System.out.println("Deposito exitoso, saldo actual:"+saldo);
        }
    }
    
    public void retirar(double cantidad){
        if(cantidad>0 && saldo>=cantidad){
            saldo-=cantidad;
            System.out.println("Retiro exitoso, saldo actual:"+saldo);
        }else{
            System.out.println("Nose puede realizar el retiro");
        }
    }
    
    public double obtenerSaldo(){
        
        return saldo;
        
    }
    
}
