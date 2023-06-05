/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_07_constructores_clases;

/**
 *
 * @author WILMER
 */
public class Persona {
   //atributos
    String nombre;
    int edad;
    
   //creamos metodos constructor no se pone nada ni voy solo public y el nombre de la clase
    public Persona (String _nombre, int _edad){
    // nos sirve para la incialización de los atributos de la clase Persona
    //el atributo nombre le paso el dato al que voy a pasar
    nombre = _nombre;
    edad= _edad;
    
    }
    
    //creamos metodo para mostras dtaos
    // el metodo void no retorna nada solo muestra resultado
    public void mostrarDtos(){
    System.out.println("El nombre es:"+nombre);
     System.out.println("Su edad  es:"+edad);
    }
    
}
