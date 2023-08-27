
package Encapsulado;

public class Encapsulamiento {

    public static void main(String[] args) {
        //Se instancia el objeto de la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        

        //Se realiza un depositi y un retiro con valores constantes        
        cuenta.depositar(1000);
        cuenta.retirar(300);

        // Muestra del saldo actual de la cuenta luego de los cambios.
        double saldoActual = cuenta.obtenerSaldo();
        System.out.println("Saldo actual: " + saldoActual);//muestra del mensaje concatenado
        // TODO code application logic here
    }
    
}
