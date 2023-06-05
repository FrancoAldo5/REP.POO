/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion_unidad_1;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Evaluacion_unidad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        Scanner leer = new Scanner(System.in);
        
        Gestion1 g=new Gestion1();
        
        do{//do while
            System.out.println("Ingresar la opcion entre 1 y 6");
            opcion=leer.nextInt();
            switch(opcion){//menu de opciones
                case 1:
                    g.Gestion1();
                    break;
                case 2:
                    g.opcion2();
                    break;
                case 3:
                    g.opcion3();
                    break;
                    
                    
            }
        }while(opcion !=6);
        // TODO code application logic here
    }
    
}
