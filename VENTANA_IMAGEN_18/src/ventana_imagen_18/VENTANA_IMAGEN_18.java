/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventana_imagen_18;
import javax.swing.JFrame;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class VENTANA_IMAGEN_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ubicacion=null;
        
        System.out.println("       MENU        ");
        System.out.println("1: Logo de la Espe");
        System.out.println("2: Paisaje");
        System.out.println("3: Hola mundo");
        int opc=in.nextInt();
        
        switch(opc){
            case 1:
                ubicacion="C:\\Users\\josep\\Desktop\\ESPE.jpg";
                break;
            case 2:
                ubicacion="C:\\Users\\josep\\Desktop\\PAISAJE.jpg";
                break;
            case 3:
                ubicacion="C:\\Users\\josep\\Desktop\\HHOLA.jpg";
        }
        System.out.println("INGRESE LA ALTURA");
        int h=in.nextInt();
        System.out.println("INGRESE EL ANCHO:");
        int w=in.nextInt();
        
        JFrame ventana = new JFrame("IMAGEN");
        ventana.setSize(800, 600);
        
        CargarImage img = new CargarImage();
        img.load(ubicacion, w, h);
        ventana.add(img);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        // TODO code application logic here
    }
    
}
