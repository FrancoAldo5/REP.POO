/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo_retorno_de_valores;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Metodo_retorno_de_valores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metod op1=new Metod();
        //pedimos los numeros para que ingrese el usuario
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
        //vemos que llama las dos variables y eso lo enviamos como argumento el metodo
        
        op1.resultados(op1.sumar(n1, n2));
        // TODO code application logic here
    }
    
}
