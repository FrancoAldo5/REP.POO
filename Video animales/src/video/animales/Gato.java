/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video.animales;

/**
 *
 * @author josep
 */
public class Gato extends Animales {
    boolean maullar;

    public Gato(boolean maullar,boolean mamifero, int patas, String nombre) {
        super(mamifero, patas, nombre);
        this.maullar= maullar;
    }
    
    public void maullar(boolean maullar){
        System.out.println("Gato maulla:"+maullar);
    }
    
    
}
