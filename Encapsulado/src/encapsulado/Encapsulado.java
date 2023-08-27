/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulado;

/**
 *
 * @author josep
 */
public class Encapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta= new CuentaBancaria();
        
        cuenta.depositar(1000);
        cuenta.retirar(300);
        
        
        double SaldoActual = cuenta.obtenerSaldo();
        System.out.println("SALDO ACTUAL:"+SaldoActual);
        // TODO code application logic here
    }
    
}
