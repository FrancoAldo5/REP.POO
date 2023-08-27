/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video.animales;

/**
 *
 * @author josep
 */
public class Animales {
    boolean mamifero;
    int patas;
    String nombre;

    public Animales(boolean mamifero, int patas, String nombre) {
        this.mamifero = mamifero;
        this.patas = patas;
        this.nombre = nombre;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mamifero (){
        System.out.println("El animal es mamifero?:"+mamifero);
    }
    public void patas(){
        System.out.println("El animal tiene, "+patas+", patas en total");
    }
    
    public void nombre (){
        System.out.println("El nombre del animal es:"+nombre);
    }
    
}
