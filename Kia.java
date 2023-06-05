/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Kia {
    
    private String modeloc;
    private int año;
    private double motor;
    private String transmision;
    private double precioTotal;
    private double precioBase = 13000.00;
    private int model;
    
    // Constructor de la clase Auto
    public Kia(int model) {
        if (model == 1) {
            this.modeloc = "Kia Picanto";
        } else if (model == 2) {
            precioBase+= 2000.00;
            this.modeloc = "Kia Rio";
        } else if (model == 3) {
            this.modeloc = "Kia Sportage";
            precioBase += 14000.00;
        } else {
            this.modeloc = "Modelo desconocido";
        }
        
        this.año = 0;
        this.motor = 0.0;
        this.transmision = "";
    }
    
    // Método para establecer el año del auto
    public void setAño(int año) {
        if (año == 2023 || año == 2024) {
            this.año = año;
        } else {
            System.out.println("Ano invalido. Se establecerá el ano por defecto.");
            this.año = 0;
        }
    }
    
    // Método para establecer el motor del auto
    public void setMotor(int motor) {
        if (motor == 1) {
            this.motor = 1.0;
        } else if (motor == 2) {
            this.motor = 1.2;
        } else {
            System.out.println("Opcion de motor invalida. Se establecera el motor por defecto.");
            this.motor = 0.0;
        }
    }
    
    // Método para establecer la transmisión del auto
    public void setTransmision(int transmision) {
        if (transmision == 1) {
            this.transmision = "Manual";
        } else if (transmision == 2) {
            this.transmision = "Automatica";
        } else {
            System.out.println("Opción de transmision invalida. Se establecera la transmision por defecto.");
            this.transmision = "";
        }
    }
    
    // Método para calcular el precio total del auto personalizado
    public double calcularPrecio() {
        double precioTotal = precioBase;
        
        if (motor == 1.2) {
            precioTotal += 2000.00;
        }
        
        if (transmision.equals("Automatica")) {
            precioTotal += 3000.0;
        }
        
        return precioTotal;
    }
    

    
    void factura(double precioTotal) {
    Scanner leer = new Scanner(System.in);
    String name;
    int ci;
    String residencia;
    String pague;
    int numero;
    System.out.println("Datos de Facturación");
    System.out.println("Registre sus datos personales:");
    System.out.println("---------------------------------");
    System.out.println("Ingrese sus nombres:");
    name = leer.nextLine();
    System.out.println("Ingrese su numero de cedula");
    ci = leer.nextInt();
    System.out.println("Numero de telefono");
    numero = leer.nextInt();
    leer.nextLine(); // Consumir el salto de línea pendiente
    System.out.println("Especifique el tipo de metodo de pago mediante el teclado");
    System.out.println("1: Credito        2: Contado");
    pague = leer.nextLine();
    System.out.println("Lugar de residencia");
    residencia = leer.nextLine();
    System.out.println("---------------------");
    System.out.println("Siempre Kia");
    System.out.println("---------------------");

    System.out.println("\033[34m                  Factura Kia               ");
    System.out.println("--------------------------");
    System.out.println("\033[34mNombres: " + name);
    System.out.println("\033[34mCedula de identidad: " + ci);
    System.out.println("\033[34mNumero de telefono: " + numero);
    System.out.println("\033[34mMetodo de pago: " + pague);
    System.out.println("\033[34mResidencia: " + residencia);
    System.out.println("\033[34m--------------------------");
    System.out.println("\033[34m                  Total a pagar              ");
    System.out.println("\033[34mPrecio total: " + precioTotal);
    System.out.println("\033[34m");
    System.out.println("\033[34mGracias por su compra");
    System.out.println("\033[34m");
    System.out.println("\033[34mRecuerde que un asesor se contactara con usted para ultimos pendeientes de la compra");
}


    
}
