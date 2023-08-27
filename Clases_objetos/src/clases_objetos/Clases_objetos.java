/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_objetos;

/**
 *
 * @author josep
 */
public class Clases_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre="Jose";
        estudiante1.edad=15;
        
        Estudiante estudiante2 = new Estudiante();
        estudiante1.nombre="Maria";
        estudiante1.edad=17;
        
        System.out.println("La información del primer estudiantes es:");
        estudiante1.mostrarInformacion();
        
        
        System.out.println("La información del segundo estudiantes es:");
        estudiante2.mostrarInformacion();
        
        // TODO code application logic here
}
    
}
