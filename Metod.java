/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_retorno_de_valores;
import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class Metod {
    //creamos metodos para sumar numros tipo public, sin retonar nada void 
    //metodo sumar
  public int sumar(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
  //metodo para mostrar resultados
    public void resultados(int suma){
        System.out.println("el resultado de toda la suma es:"+suma);
    }  
}
