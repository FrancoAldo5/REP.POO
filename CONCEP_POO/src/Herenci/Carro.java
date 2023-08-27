
package Herenci;
public class Carro extends Vehiculo {//clase hija que hereda de la clase Vehiculo
    int puertas;//atributo propio de la clase hija

    public Carro(String marca, String modelo, int puertas) {//constructor de la clase incluyendo 
        //el super con los atributos anteriores
        super(marca, modelo);
        this.puertas = puertas;
    }

    public void conducir(){// metodo para conducir, y es de la clase hija
        System.out.println("El coche está en movimiento.");
    }
}