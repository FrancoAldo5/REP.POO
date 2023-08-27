/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejum;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author josep
 */
public class Ejum {
    public static void main(String[] args) {
        //Declaracion de atributos
        Scanner in = new Scanner(System.in);
        String ubicacion=null;
        //Menu para elegir que imagen se mostrara
        System.out.println("==MENU==");
        System.out.println("1. Logo ESPE");
        System.out.println("2. Paisaje");
        System.out.println("3. Hola mundo");
        int opc=in.nextInt();
        switch(opc){
            case 1:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\Imagen\\espe.png";
                break;
            case 2:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\Imagen\\paisaje.jpg";
                break;
            case 3:
                ubicacion="C:\\Users\\johng\\OneDrive\\Escritorio\\Imagen\\holamundo.png";
                break;
        }
        
        //Se elige los nuevas dimensiones de la imagen
        System.out.println("Ingresa la nueva altura");
        int h = in.nextInt();
        System.out.println("Ingresa la nueva anchura");
        int w = in.nextInt();
        //Se instancia un objeto JFrame que nos mostrara una ventana en el computador ademas del titulo entre los parentesis
        JFrame ventana = new JFrame("IMAGEN");
        //Definimos el tamaño de la ventana
        ventana.setSize(800,600);
        //Instanciamos un objeto para cargar la imagen
        CargarImage img = new CargarImage();
        //Se envia la ubicacion y las dimensiones de la imagen
        img.load(ubicacion,w,h);
        //Se agrega la imagen a la ventana 
        ventana.add(img);
        //Se indica que se deje de ejecutar cuando se cierre la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Se hace visible la ventana
        ventana.setVisible(true);
    }
    
}
