/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_practica_14_interfaces;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class POO_Practica_14_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double r,a,b;
        double lado;
        int op;
        
        
        
        
        do{
            
            System.out.println("----------MENU---------");
            System.out.println("1:Cuadrado");
            System.out.println("2:Circulo");
            System.out.println("3:Rectangulo");
            System.out.println("4:salir");
            System.out.println("-----------------------");
            op=leer.nextInt();  
            
            switch(op){
                case 1:
                    System.out.println("---------CUADRADO------------");
                    System.out.println("Ingrese el lado del cuadrado");
                    lado=leer.nextDouble();
                    
                    Cuadrado cuadra=new Cuadrado(lado);
                    cuadra.calcularArea();
                    System.out.println("El area del cuadrado es del cuadrado es de:"+cuadra.calcularArea());
                break;
                
                case 2:
                    System.out.println("---------CIRCULO-------------");
                    System.out.println("Ingrese el radio del circulo");
                    r=leer.nextDouble();
                    Circulo circulo= new Circulo(r);
                    circulo.calcularArea();
                    System.out.println("El radio del circulo es de:"+circulo.calcularArea());
                    break;
                    
                case 3:
                    System.out.println("---------RECTANGULO-------------");
                    System.out.println("Ingrese la altura:");
                    a=leer.nextDouble();
                    System.out.println("Ingrese la base");
                    b=leer.nextDouble();
                    Rectangulo rectan=new Rectangulo(a,b);
                    rectan.calcularArea();
                    System.out.println("El area del rectangulo es de:"+rectan.calcularArea());
                    break;
                    
                case 4:
                    break;
                    
            }
        }while(4!=op);
        
        
        
        
        // TODO code application logic here
    }
    
}
