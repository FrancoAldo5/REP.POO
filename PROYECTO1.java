/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class PROYECTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
      String verde = "\033[42m";
      
        // Crear objeto Scanner para leer la entrada del usuario
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        // Mostrar los modelos disponibles
        System.out.println("\033[31m-----KIA MOTORS----\u001B[0m");
        System.out.println("Modelos disponibles:");
        System.out.println("[1] Kia Picanto    [$13000.00]");
        System.out.println("[2] Kia Rio        [$15000.00]");
        System.out.println("[3] Kia Sportage   [$27000.00]");
        System.out.println("Elige un modelo (1-3): ");
        System.out.println("Tu opcion aqui:");
        
        // Leer la opción del modelo elegido
        int modelo = scanner.nextInt();
        // Validar la opción del modelo elegido
        if (modelo < 1 || modelo > 3) {
            System.out.println("Opcion invalida. Saliendo del programa.");
            return;
        }
        
        
        // Crear objeto de la clase Auto con el modelo elegido
        Kia auto = new Kia(modelo);
        
        // Mostrar las opciones de personalización
        System.out.println("\033[47mPersonalizacion del auto:");
        System.out.println("Favor seguir los pasos a continuacion mencionados para realizar la completa personalizacion del auto");
        System.out.println("\033[47mPrimer paso escoja el: ");
        System.out.println("Ano (2023 o 2024)");
        System.out.println("\033[47mSegundo paso escoja el: ");
        System.out.println("Motor (1.0L o 1.2L)");
        System.out.println("\033[47mTercer paso escoja la: ");
        System.out.println("Transmision (Manual o Automatica)");
                
        
        // Personalización del año
        System.out.println("\n\033[47mElige el ano (2023-2024): ");
        int año = scanner.nextInt();
        auto.setAño(año);
        
        // Personalización del motor
        System.out.println("\033[47mElige el motor(1-2):");
        System.out.println("[1] Motor 1.0L +[$0.00]");
        System.out.println("[2] Motor 1.2L +[$2000.00]");
        System.out.println("Tu opcion aqui:");
        int motor = scanner.nextInt();
        auto.setMotor(motor);
        
        // Personalización de la transmisión
        System.out.println("\033[47mElige la transmision (1-2):");
        System.out.println("[1] Manual +[$0.00]");
        System.out.println("[2] Automatica+[$3000.00]");
        int transmision = scanner.nextInt();
        auto.setTransmision(transmision);
        
        
        // Calcular el precio total del auto
        double precioTotal = auto.calcularPrecio();
        
        // Mostrar el precio total del auto personalizado
        System.out.println(" ");        
        System.out.println("\033[42mPrecio total de se auto personalizado es: ");
        System.out.print(verde + "            $" + precioTotal+"                      ");
        System.out.println("---");
        
        
        
        
        
        
        System.out.println("Datos de Facturación");
        System.out.println("Registre sus datos personales:");
        System.out.println("---------------------------------");
        
        auto.factura(precioTotal);
        
        
        // TODO code application logic here
    }
    
    
}
