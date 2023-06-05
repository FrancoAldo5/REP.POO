package arreglo_string;

import java.util.Scanner;

public class Arreglo_string {

    public static void main(String[] args) {
        int opcion = 0;//variable de opcion
        Scanner leer = new Scanner(System.in);

        do {//ciclo do para seleccionar lo reuqerido
            //menu de opciones disponibles
            System.out.println("-------------------------------");
            System.out.println("Mi numero de ejercicio es el (4)numeros primos");
            System.out.println("");
            System.out.println("1: Arreglo de numeros");
            System.out.println("2: Arreglo de Strings");
            System.out.println("3: Encontrar numero primo en la posicion 4");
            System.out.println("4: Salir");
            System.out.println("-------------------------------");
            opcion = leer.nextInt();//ingreso de la opcion
            Clasefor op=new Clasefor();//creacion del objeto, llamando a la clase
            switch (opcion) {
                case 1:
                    op.opcion1();//opcion de ingresar numeros al arreglo y mostrarlos
                    break;
                case 2:
                    op.opcion2();//opcion de ingreso de caracteres al arreglo
                    break;
                case 3:
                    op.opcion3();//opcion de detectción de numero primo en la posicion 4 del arreglo
                    break;
                case 4://opcion de salir
                    break;
            }
        } while (opcion != 4);
    }
}
