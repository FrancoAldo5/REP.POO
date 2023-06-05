/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_string;

import java.util.Scanner;

/**
 *
 * @author josep
 */
class Clasefor {
    Scanner leer = new Scanner(System.in);
    
    public void opcion1(){//metodo de la opcion 1
        int n1,i;
        System.out.println("Ingrese el tamaño del arreglo");
        n1 = leer.nextInt();
        int[] numeros = new int[n1];//creacion y asignacion del arreglo
        for (i = 0; i < n1; i++) {//for para el ingreso de números
            System.out.println("Ingrese un numero");
            numeros[i] = leer.nextInt();
        }
        for (i = 0; i < n1; i++) {//for, muestra los datos ingresados
            System.out.println("Arreglo de numeros " + (i + 1) + ": " + numeros[i]);
        }
    }
    
    
    public void opcion2(){// metodo para opcion 2
        int n,i;
        System.out.println("Ingrese el tamaño del arreglo");//ingreso de magnitud del arreglo
        n = leer.nextInt();
        leer.nextLine();
        String[] palabras = new String[n];//creacion y asigancion del arreglo
        for (i = 0; i < n; i++) {//for, ingreso de caracteres
            System.out.println("Ingrese una palabra");
            palabras[i] = leer.nextLine();
        }

        for (i = 0; i < n; i++) {//muestra de caracteres con su respectiva posicion del arreglo
            System.out.println("Arreglo de Strings " + (i + 1) + ": " + palabras[i]);
        }

                    // Mostrar con for each
    }
    
 
    
    public void opcion3() {
    int np = 5; // Tamaño máximo del arreglo
    int[] primo = new int[np]; // Arreglo
    int cantidadIngresada = 0; // Contador de números ingresados

    for (int i = 0; i < np; i++) { // Ingreso de datos
        if (cantidadIngresada >= 5) { // Si ya se han ingresado 5 números, salir del bucle
            break;
        }
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        primo[i] = numero;
        cantidadIngresada++;
    }

    int numeroEnPosicion4 = primo[3]; // Número en la posición 4

    int l = 0; // Contador
    for (int o = 1; o <= numeroEnPosicion4; o++) { // For para verificar si el número es primo
        if (numeroEnPosicion4 % o == 0) {
            l++; // Contador almacenado
        }
    }

    if (l == 2) { // Si el contador es igual a 2, significa que es un número primo
        System.out.println("Se encontró un número primo en la posición 4 del arreglo: " + numeroEnPosicion4);
    } else {
        System.out.println("No se encontró un número primo en la posición 4 del arreglo.");
    }
}

    
    
}
