/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video.animales;

/**
 *
 * @author josep
 */
public class Perro extends Animales{
    boolean ladra;

    public Perro(boolean ladra,boolean mamifero, int patas, String nombre) {
        super(mamifero, patas, nombre);
        this.ladra=ladra;
    }
    
    public void ladrar(boolean ladra){
        System.out.println("Perro ladra:"+ladra);
    }
    
}
