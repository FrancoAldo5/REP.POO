/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_uni3_poo;

import Vista.Login;
import Vista.Profesor;
import Vista.Registro_2;
import javax.swing.SwingUtilities;

/**
 *
 * @author josep
 */
public class LAB2_UNI3_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            Profesor profesor = new Profesor();
            profesor.setVisible(true);
        });
            
            
        
        // TODO code application logic here
    }
    
}
