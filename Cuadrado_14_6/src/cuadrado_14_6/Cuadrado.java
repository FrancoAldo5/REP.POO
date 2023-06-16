/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado_14_6;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Cuadrado {
    Scanner leer = new Scanner(System.in);
    int area,perimetro;
    
    int a;
    public  Cuadrado(int a){
        this.a=a;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public int calarea(){
      
        return a*a;
    }
    
    public int calperimetro(){
   
        
        return 4*a;
    }
    
}
