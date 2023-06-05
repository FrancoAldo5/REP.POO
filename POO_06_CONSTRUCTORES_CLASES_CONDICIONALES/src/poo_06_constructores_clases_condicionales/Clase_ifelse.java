/*
POO_06_CONSTRUCTORES_CLASES_CONDICIONALES
 */
package poo_06_constructores_clases_condicionales;

import java.util.Scanner;// importamos la liberri para capturar datos

public class Clase_ifelse {
    private int nota=0;   //va con PRIVATE PORQUE USAMOS EL PARADIGMA DE ENCAPSULACION
    /*PARADIGMA DE ENCAPSULACION Se refiere a la técnica de ocultar los detalles internos de un objeto 
       y exponer solo una interfaz controlada para interactuar con él*/
    Scanner leer=new Scanner(System.in);  //creamos un objeto de tipo scanner
    
    public  Clase_ifelse(){ 
        //CONSTRUCTOR el constructor se llama igual que la clase pero sin class (public Clase_ifelse(){})
        //SI NO LO PONEMOS NEBEANS LO PONE IMPLICITAMENTE
    }
public void condicion(){//creamos el metodo condición
        if(nota<7 &&nota>=0){
            System.out.println("REPROBADO");
        }else{
            System.out.println("Aprobado");
        }
    }
    public void leerNota(){  // Metodo que no retorna ningun valor    
        System.out.println("Ingrese la nota");
        nota=leer.nextInt();  // proceso para leer un     int
        condicion();  // invocacion o llamada al metodo condición
    }
    
    
}
