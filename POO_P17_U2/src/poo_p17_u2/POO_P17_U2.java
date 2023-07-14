/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p17_u2;

import controller.Control;
import model.Modelo;
import view.Vista;

/**
 *
 * @author josep
 */
public class POO_P17_U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vista= new Vista();
        Control cont= new Control(vista,mod);
        // TODO code application logic here
        vista.setVisible(true);
    }
    
}
