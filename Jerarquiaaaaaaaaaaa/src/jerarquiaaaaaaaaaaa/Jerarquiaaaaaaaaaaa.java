/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jerarquiaaaaaaaaaaa;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author josep
 */
public class Jerarquiaaaaaaaaaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director director=new Director("Johnn Doe",40,LocalDate.of(2020,03,04),18000,"ventas",25);
        Operario operario= new Operario("Jane Smith",25,LocalDate.of(2021, 03, 1),12000,3);
        System.out.println("                  DIRECTOR");
        System.out.println("salario del director antes incentivar"+director.getSalario());
        director.incentivar();
        System.out.println("salario del director despues del intencivo"+director.getSalario());
        
        System.out.println("                  OPERARIO");
        System.out.println("salario del operario antes de incentivar"+operario.getSalario());
        operario.incentivar();
        System.out.println("salario del operario despues del incentivo"+operario.getSalario());
        
        
        operario.actnivel();
        System.out.println("el nivel del operario es:"+operario.getNivel());
        
        
        
        // TODO code application logic here
    }
    
}
