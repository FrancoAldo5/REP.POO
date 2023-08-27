package Encapsulado;
public class CuentaBancaria {
    private double saldo;//Atributo de manera´privada que almacena el saldo
    
    //Metodo para depositar dinero a la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;//suma del valor a ingresar a la cuenta
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);//muestra del saldo
        }
    }
    
    
    //Metodo par retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {//condiciones para hacer el retiro
            saldo -= cantidad;//resta de la cantidad al saldo
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede realizar el retiro.");
        }
    }
    
    //Metodo para mostar el saldo actual
    public double obtenerSaldo() {
        return saldo;
    }
}





