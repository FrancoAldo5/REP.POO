/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_06_constructores_clases_condicionales;

import javax.swing.JOptionPane;
/**
 *
 * @author josep
 */
public class Prac {
    
    int suma;
    int resta;
    int n1;
    int n2;
    
    public void captura (){
        int n1= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor 2"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor 2"));
    }
    
    public void operaciones(){
        suma= n1+n2;
        resta= n1-n2;
    }
    
    public void resultados(){
        System.out.println("el resultado de la suma es:"+suma);
        System.out.println("el resultado de la suma es:"+resta);
    }
    
    
}
