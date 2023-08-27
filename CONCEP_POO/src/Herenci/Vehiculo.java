package Herenci;
public class Vehiculo {//Clase padre
    //Atributos de la clase padre
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {//constructor de los atributos
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {//metodo propio de la clase, para arrancar
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {//metodo para detener
        System.out.println("El vehículo se está deteniendo.");
    }

    public void mostrarInfo() {//metodo para mostrar la informacion de los atributos
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}